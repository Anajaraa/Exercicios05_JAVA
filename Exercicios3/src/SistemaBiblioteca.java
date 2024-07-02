public class SistemaBiblioteca {
    public static void main(String[] args) {
        ItemBiblioteca livro = new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos", " Aditya Y. Bhargava", 2017, GeneroLivro.CIENTIFICO);
        ItemBiblioteca revista = new Revista("Forbes USA", "Diversos", 2023, 202);
        ItemBiblioteca dvd = new DVD("Matrix", "Wachowski", 1999, 136);

        livro.imprimirDetalhes();
        revista.imprimirDetalhes();
        dvd.imprimirDetalhes();

        System.out.println("Multa por atraso do Livro: " + livro.calcularMultaAtraso(3) + " reais");
        System.out.println("Multa por atraso da Revista: " + revista.calcularMultaAtraso(3) + " reais");
        System.out.println("Multa por atraso do DVD: " + dvd.calcularMultaAtraso(3) + " reais");

        ((Emprestimo) livro).emprestar();
        ((Devolucao) livro).devolver();
        ((Emprestimo) revista).emprestar();
        ((Devolucao) revista).devolver();
        ((Emprestimo) dvd).emprestar();
        ((Devolucao) dvd).devolver();
    }
}
