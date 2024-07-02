public class Eletronicos extends Produto implements AplicarDesconto, CalcularFrete {
    public Eletronicos(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }

    @Override
    public double calcularValorTotalEstoque() {
        return preco * quantidadeEmEstoque;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Eletrônicos - Nome: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    @Override
    public double calcularFrete() {
        return 20.0;
}
}
