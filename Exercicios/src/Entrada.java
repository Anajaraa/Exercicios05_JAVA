public class Entrada extends Refeicao {
    public Entrada(String nome, double preco) {
        super(nome, preco, TipoRefeicao.ENTRADA);
    }

    @Override
    public double calcularValorTotal() {
        return preco;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Entrada: " + nome + " - Preço: " + preco);
    }
}
