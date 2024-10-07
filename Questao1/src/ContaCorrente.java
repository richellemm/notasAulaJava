public class ContaCorrente extends ContaBancaria{


    public void chequeEspecial() {
        double chequeEspecial = 1000.00;
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Cheque especial utilizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }
}