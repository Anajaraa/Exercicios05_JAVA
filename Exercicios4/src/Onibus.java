public class Onibus extends Transporte implements Manutencao, HorarioFuncionamento {
    public Onibus(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int passageiros) {
        return passageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Ônibus - Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Ônibus em manutenção.");
    }

    @Override
    public void mostrarHorarioFuncionamento() {
        System.out.println("Ônibus funciona das 05:00 às 23:00.");
    }
}
