public abstract class Refeicao {
    protected String nome;
    protected double preco;
    protected TipoRefeicao tipo;

    public Refeicao(String nome, double preco, TipoRefeicao tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public abstract double calcularValorTotal();
    public abstract void imprimirDetalhes();
}
