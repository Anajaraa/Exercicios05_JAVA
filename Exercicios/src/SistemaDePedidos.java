public class SistemaDePedidos {
    public static void main(String[] args) {
        Refeicao entrada = new Entrada("Salada", 15.00);
        Refeicao pratoPrincipal = new PratoPrincipal("Filé de Peixe", 40.00);
        Refeicao sobremesa = new Sobremesa("Sorvete", 10.00);

        entrada.imprimirDetalhes();
        pratoPrincipal.imprimirDetalhes();
        sobremesa.imprimirDetalhes();

        Desconto desconto = (PratoPrincipal) pratoPrincipal;
        double precoComDesconto = desconto.aplicarDesconto(5.00);
        System.out.println("Preço do Prato Principal com desconto: " + precoComDesconto);

        OfertaEspecial ofertaEspecial = (Sobremesa) sobremesa;
        ofertaEspecial.aplicarOfertaEspecial();
    }
}
