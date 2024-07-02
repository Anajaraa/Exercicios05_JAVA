public class Desenvolvedor extends Funcionario implements AvaliacaoDesempenho {
    public Desenvolvedor(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return salario * 0.15;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Desenvolvedor: " + nome + ", Idade: " + idade + ", Salário: " + salario + ", Departamento: " + departamento);
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println(nome + " está sendo avaliado.");
    }
}
