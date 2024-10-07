public class Cachorro extends Animal {


    public Cachorro(String nome, String raca) {
        super(nome, raca);
        this.nome = nome;
        this.raca = raca;
    }

    public void late(){
        System.out.println(this.nome + " é um cachorro e cachorros latem.");
    }
}
