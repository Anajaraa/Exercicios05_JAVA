public class SistemaDeGerenciamento {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Doug", 23, 8000.00, Departamento.MARKETING);
        Funcionario desenvolvedor = new Desenvolvedor("Neto", 30, 5000.00, Departamento.TI);
        Funcionario analista = new Analista("Dennys", 28, 4000.00, Departamento.RH);
        Funcionario advogado = new Gerente("Thiago", 50, 10000.00, Departamento.JURIDICO);
        Funcionario devSenior = new Desenvolvedor("Anajara", 37, 7000.00, Departamento.DESENVOLVIMENTO);

        gerente.imprimirDetalhes();
        desenvolvedor.imprimirDetalhes();
        analista.imprimirDetalhes();
        advogado.imprimirDetalhes();
        devSenior.imprimirDetalhes();

        System.out.println("Bônus Anual Gerente: " + gerente.calcularBonusAnual());
        System.out.println("Bônus Anual Desenvolvedor: " + desenvolvedor.calcularBonusAnual());
        System.out.println("Bônus Anual Analista: " + analista.calcularBonusAnual());
        System.out.println("Bônus Anual Advogado: " + advogado.calcularBonusAnual());
        System.out.println("Bônus Anual Desenvolvedor Senior: " + devSenior.calcularBonusAnual());

        ((AvaliacaoDesempenho) gerente).avaliarDesempenho();
        ((AvaliacaoDesempenho) desenvolvedor).avaliarDesempenho();
        ((Treinamento) gerente).treinar();
        ((Treinamento) analista).treinar();
    }
}
