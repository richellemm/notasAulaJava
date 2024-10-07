
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Qual a distância percorrida (km)?");
        c.setDistancia(sc.nextDouble());
        System.out.println("Qual o tempo de espera?");
        c.setTempoEspera(sc.nextInt());
        System.out.println("Qual a tarifa base do serviço?");
        c.setTarifaBase(sc.nextDouble());
        System.out.println("Qual o fator demanda dessa corrida (valor maior que zero)?");
        c.setFatorDemanda(sc.nextDouble());


        c.calcularValorCorrida();
        c.exibirDetalhesCorrida();


    }
}