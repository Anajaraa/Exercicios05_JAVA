public class SistemaLojaOnline {
    public static void main(String[] args) {
        Produto eletronico = new Eletronicos("iPhone 11 Pro", 4500.0, 10);
        Produto roupa = new Roupas("Moletom Sailormoon", 80.0, 160);
        Produto alimento = new Alimentos("Sacola Econômica", 160.0, 200);

        eletronico.imprimirDetalhes();
        roupa.imprimirDetalhes();
        alimento.imprimirDetalhes();

        System.out.println("Valor total do estoque de Eletrônicos: " + eletronico.calcularValorTotalEstoque() + " reais");
        System.out.println("Valor total do estoque de Roupas: " + roupa.calcularValorTotalEstoque() + " reais");
        System.out.println("Valor total do estoque de Alimentos: " + alimento.calcularValorTotalEstoque() + " reais");

        System.out.println("Preço com desconto (10%) de Eletrônicos: " + ((AplicarDesconto) eletronico).aplicarDesconto(10) + " reais");
        System.out.println("Preço com desconto (20%) de Roupas: " + ((AplicarDesconto) roupa).aplicarDesconto(20) + " reais");
        System.out.println("Preço com desconto (5%) de Alimentos: " + ((AplicarDesconto) alimento).aplicarDesconto(5) + " reais");

        System.out.println("Frete de Eletrônicos: " + ((CalcularFrete) eletronico).calcularFrete() + " reais");
        System.out.println("Frete de Roupas: " + ((CalcularFrete) roupa).calcularFrete() + " reais");
        System.out.println("Frete de Alimentos: " + ((CalcularFrete) alimento).calcularFrete() + " reais");
    }
}

