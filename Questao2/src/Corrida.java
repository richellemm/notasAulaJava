public class Corrida {
    private double distancia, tarifaBase, fatorDemanda, valorFinal;
    private int tempoEspera;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }


    public void calcularValorCorrida(){

        valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida(){
        System.out.println("Valor final da corrida: " + valorFinal);
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Tempo de espera: " + tempoEspera);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);

    }
}
