public class PratoPrincipal extends Refeicao implements Desconto {
    public PratoPrincipal(String nome, double preco) {
        super(nome, preco, TipoRefeicao.PRATO_PRINCIPAL);
    }

    @Override
    public double calcularValorTotal() {
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Prato Principal: " + nome + " - Preço: " + preco);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return preco - valor;
    }
}
