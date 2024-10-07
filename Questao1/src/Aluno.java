public class Aluno {
    private String nome;
    private double nota1, nota2, nota3, media;


    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1= nota1;
    }
    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2= nota2;
    }
    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3= nota3;
    }
    public double getNota3() {
        return nota3;
    }

    public void setMedia(double media) {
        this.media= media;
    }
    public double getMedia() {
        return media;
    }

    public void calcularMedia(){
        media = (nota1 + nota2 + nota3) / 3;

    }

    public void verificarAprovacao() {
        if (media >= 7) {
            System.out.println("Situação: Aprovado.");
        }
        else if ( media >=4) {
            System.out.println("Situação: Final.");
        }
        else {
            System.out.println("Situação: Reprovado.");

        }

    };

    public void exibirDetalhesAluno(){
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);
        verificarAprovacao();
    }
}