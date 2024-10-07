import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();

        do{
            System.out.println("Caso Escolha 1: Cadastre Gerente, Caso escolha 2: Cadastrar Programador ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Qual o nome do funcionário?");
                    g.setNome(sc2.nextLine());
                    System.out.println("Qual o ano de nascimento?");
                    g.setNasc(sc.nextInt());
                    System.out.println("Qual o salário?");
                    g.setSalario(sc.nextDouble());
                    System.out.println("Qual o projeto que ele está alocado?");
                    g.setProjeto(sc2.nextLine());

                    g.calcularIdade();

                    break;

                case 2:
                    System.out.println("Qual o nome do funcionário?");
                    p.setNome(sc2.nextLine());
                    System.out.println("Qual o ano de nascimento?");
                    p.setNasc(sc.nextInt());
                    System.out.println("Qual o salário?");
                    p.setSalario(sc.nextDouble());
                    System.out.println("Qual a linguagem utilizada?");
                    p.setLinguagem(sc2.nextLine());

                    p.calcularIdade();
                    break;

                    default:
                    System.out.println("Opção inválida");
            }
            System.out.println("repetir S/N");
            r=sc.next();
        } while (r.equalsIgnoreCase("s"));

        System.out.println("Informações do gerente");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Idade: " + g.getIdade());
        System.out.println("Salário: R$ " + g.getSalario());
        System.out.println("Projeto: " + g.getProjeto());

    }
    }