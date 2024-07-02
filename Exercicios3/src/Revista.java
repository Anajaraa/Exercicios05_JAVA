public class Revista extends ItemBiblioteca implements Emprestimo, Devolucao {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso * 1.0;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + ", Edição: " + edicao);
    }

    @Override
    public void emprestar() {
        System.out.println(titulo + " foi emprestada.");
    }

    @Override
    public void devolver() {
        System.out.println(titulo + " foi devolvida.");
    }
}
