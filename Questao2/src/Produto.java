public class Produto {
    private int codigo, qtdEstoque, qtdVendida;
    private String nome, cor;
    private double tamanho, valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public void exibirProduto(){
        System.out.println("Nome do produto: " + this.getNome());
        System.out.println("Código do produto: " + this.getCodigo());
        System.out.println("Valor do produto: R$ " + this.getValor());
        System.out.println("Tamanho do produto: " + this.getTamanho());
        System.out.println("Cor do produto: " + this.getCor());
        System.out.println("Quantidade em estoque do produto: " + this.getQtdEstoque());
    }

    public void atualizaEstoque(){
        qtdEstoque =  qtdEstoque - qtdVendida;

    }

    public void informaEstoque(){
        System.out.println("Quantidade do produto em estoque: " + qtdEstoque);
    }
    }
