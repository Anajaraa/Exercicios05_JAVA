public class Livro extends ItemBiblioteca implements Emprestimo, Devolucao {
    private GeneroLivro genero;

    public Livro(String titulo, String autor, int anoPublicacao, GeneroLivro genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso * 1.5;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + ", Gênero: " + genero);
    }

    @Override
    public void emprestar() {
        System.out.println(titulo + " foi emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println(titulo + " foi devolvido.");
    }
}
