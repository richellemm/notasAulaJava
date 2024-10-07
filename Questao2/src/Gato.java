public class Gato extends Animal{


    public Gato(String nome, String raca) {
        super(nome, raca);
        this.nome = nome;
        this.raca = raca;
    }

    public void mia(){
        System.out.println(this.nome + " é um gato e gatos miam.");
    }
}
