public class Metro extends Transporte implements Manutencao, HorarioFuncionamento {
    public Metro(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int passageiros) {
        return passageiros * tarifa;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Metrô - Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Metrô em manutenção.");
    }

    @Override
    public void mostrarHorarioFuncionamento() {
        System.out.println("Metrô funciona das 05:00 às 01:00.");
    }
}
