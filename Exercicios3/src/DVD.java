public class DVD extends ItemBiblioteca implements Emprestimo, Devolucao {
    private int duracao;

    public DVD(String titulo, String autor, int anoPublicacao, int duracao) {
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso * 2.0;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DVD: " + titulo + ", Diretor: " + autor + ", Ano: " + anoPublicacao + ", Duração: " + duracao + " minutos");
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
