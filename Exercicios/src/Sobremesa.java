public class Sobremesa extends Refeicao implements OfertaEspecial {
    public Sobremesa(String nome, double preco) {
        super(nome, preco, TipoRefeicao.SOBREMESA);
    }

    @Override
    public double calcularValorTotal() {
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Sobremesa: " + nome + " - Preço: " + preco);
    }

    @Override
    public void aplicarOfertaEspecial() {
        System.out.println("Oferta Especial Aplicada: Sobremesa grátis!");
    }
}
