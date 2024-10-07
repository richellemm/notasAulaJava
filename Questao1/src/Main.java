import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Nome do aluno: ");
        a.setNome(sc.nextLine());
        System.out.println("Nota 1: ");
        a.setNota1(sc2.nextDouble());
        System.out.println("Nota 2: ");
        a.setNota2(sc2.nextDouble());
        System.out.println("Nota 3: ");
        a.setNota3(sc2.nextDouble());

        a.calcularMedia();
        System.out.println("INFORMAÇÕES DO ALUNO");
        a.exibirDetalhesAluno();

    }
}