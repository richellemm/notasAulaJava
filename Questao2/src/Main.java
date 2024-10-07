import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, qtdParcela;
        double troco, valorRecebido;
        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        do {
            System.out.println("Digite 1: Cadastrar o produto");
            System.out.println("Digite 2: Fazer venda");
            System.out.println("Digite 3: Verificar estoque");
            System.out.println("Digite 4: Sair");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Qual o nome do produto?");
                    p.setNome(sc2.nextLine());
                    System.out.println("Qual o código do produto?");
                    p.setCodigo(sc.nextInt());
                    System.out.println("Qual o valor do produto?");
                    p.setValor(sc.nextDouble());
                    System.out.println("Qual o tamanho do produto?");
                    p.setTamanho(sc.nextDouble());
                    System.out.println("Qual o cor do produto?");
                    p.setCor(sc2.nextLine());
                    System.out.println("Quantos produtos há em estoque?");
                    p.setQtdEstoque(sc.nextInt());

                    p.exibirProduto();

                    break;

                case 2:
                    System.out.print("Quantidade a ser vendida do produto " + p.getCodigo() + " - " + p.getNome() + ":");
                    p.setQtdVendida(sc.nextInt());

                    if (p.getQtdEstoque() == 0) {
                        System.out.println("Produto precisa ser cadastrado ou recadastrado.");
                        break;
                    } else if (p.getQtdVendida() > p.getQtdEstoque()) {
                        System.out.println("Quantidade em estoque insuficiente!");
                        break;
                    }
                    double valorTotal = p.getValor() * p.getQtdVendida();
                    System.out.println("Valor Total: R$" + valorTotal);

                    System.out.print("Escolha a forma de pagamento (Pix (1), Espécie(2), Transferência(3), Débito(4), Crédito(5): ");
                    int formaPagamento = sc.nextInt();

                    if (formaPagamento == 1 || formaPagamento == 2 || formaPagamento == 3 || formaPagamento == 4) {

                        valorTotal *= 0.95; //desconto 5%
                        System.out.printf("Valor com desconto: R$%.2f\n", valorTotal);

                        if (formaPagamento == 2) {
                            do {
                                System.out.print("Valor recebido: R$ ");
                                valorRecebido = sc.nextDouble();
                                troco = valorRecebido - valorTotal;

                                if (troco < 0) {
                                    System.out.println("Valor recebido é insuficiente!");
                                }

                            } while (troco < 0);

                            System.out.printf("Troco: R$ %.2f\n", troco);
                        }

                    } else if (formaPagamento == 5) {
                        System.out.println("Pagamento em crédito selecionado. Você pode parcelar até em 3x SEM JUROS. Deseja parcelar? Digite 1 para SIM e 2 para NÃO");
                        int parcelaSimouNao = sc.nextInt();

                        if (parcelaSimouNao == 1) {
                            System.out.println("2x " + valorTotal / 2 + " = R$ " + valorTotal);
                            System.out.println("3x " + valorTotal / 3 + " = R$ " + valorTotal);
                            System.out.println("Gostaria de dividir em quantas vezes?");
                            qtdParcela = sc.nextInt();

                            while (qtdParcela > 3) {
                                System.out.println("Você só pode dividir em até 3x.");
                                System.out.println("Gostaria de dividir em quantas vezes?");
                                qtdParcela = sc.nextInt();
                            }

                            System.out.println("Valor a pagar: R$ " + valorTotal);
                            System.out.println("Quantidade de parcelas: " + qtdParcela + ".");
                            System.out.println("Valor da Parcela: R$ " + valorTotal / qtdParcela + ".");
                            System.out.println("Pagamento realizado na modalidade crédito (" + qtdParcela + "x).");

                        } else if (parcelaSimouNao == 2) {
                            System.out.println("Pagamento realizado na modalidade crédito (1x).");

                        } else {
                            System.out.println("Opção inválida para parcelamento!");
                        }

                    } else {
                        System.out.println("Forma de pagamento inválida!");
                    }

                    p.atualizaEstoque();
                    System.out.println("Venda realizada com sucesso!");

                    break;

                case 3:
                   p.informaEstoque();

                    break;

                case 4:
                    System.out.println("Obrigada! Volte sempre.");

                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (x != 4);


    }
}
