public class Trem extends Transporte implements Manutencao, HorarioFuncionamento {
    public Trem(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int passageiros) {
        return passageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Trem - Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Trem em manutenção.");
    }

    @Override
    public void mostrarHorarioFuncionamento() {
        System.out.println("Trem funciona das 04:00 às 00:00.");
    }
}
