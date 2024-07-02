public abstract class Transporte {
    protected int numeroAssentos;
    protected int capacidade;
    protected double tarifa;

    public Transporte(int numeroAssentos, int capacidade, double tarifa) {
        this.numeroAssentos = numeroAssentos;
        this.capacidade = capacidade;
        this.tarifa = tarifa;
    }

    public abstract double calcularTarifaTotal(int passageiros);
    public abstract void imprimirDetalhes();
}
