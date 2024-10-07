import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);
        Gato g = new Gato("Flor", "Persia");
        Cachorro c = new Cachorro("Loki", "Vira-lata");

        do {
            System.out.println("Caso Escolha 1: Exibir informações do gato, Caso escolha 2: Exibir informações do cachorro");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Informações do gato");
                    System.out.println("Nome: " + g.getNome());
                    System.out.println("Raça: " + g.getRaca());
                    g.mia();
                    g.caminha();

                    break;

                case 2:
                    System.out.println("Informações do cachorro");
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Raça: " + c.getRaca());

                    c.late();
                    c.caminha();

                    break;

                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("repetir S/N");
            r = sc.next();
        } while (r.equalsIgnoreCase("s"));

        System.out.println("Obrigada! Volte sempre.");
    }
}
