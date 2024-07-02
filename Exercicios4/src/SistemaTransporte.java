public class SistemaTransporte {
    public static void main(String[] args) {
        Transporte onibus = new Onibus(40, 100, 2.50);
        Transporte trem = new Trem(200, 600, 3.00);
        Transporte metro = new Metro(150, 900, 2.80);

        onibus.imprimirDetalhes();
        trem.imprimirDetalhes();
        metro.imprimirDetalhes();

        System.out.println("Tarifa total do Ônibus para 50 passageiros: " + onibus.calcularTarifaTotal(50) + " reais");
        System.out.println("Tarifa total do Trem para 500 passageiros: " + trem.calcularTarifaTotal(500) + " reais");
        System.out.println("Tarifa total do Metrô para 600 passageiros: " + metro.calcularTarifaTotal(600) + " reais");

        ((Manutencao) onibus).realizarManutencao();
        ((HorarioFuncionamento) onibus).mostrarHorarioFuncionamento();
        ((Manutencao) trem).realizarManutencao();
        ((HorarioFuncionamento) trem).mostrarHorarioFuncionamento();
        ((Manutencao) metro).realizarManutencao();
        ((HorarioFuncionamento) metro).mostrarHorarioFuncionamento();
    }
}
