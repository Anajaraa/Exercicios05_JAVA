public abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract double calcularMultaAtraso(int diasAtraso);
    public abstract void imprimirDetalhes();
}
