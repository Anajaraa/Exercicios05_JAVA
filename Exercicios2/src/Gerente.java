public class Gerente extends Funcionario implements AvaliacaoDesempenho, Treinamento {
    public Gerente(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return salario * 0.2;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Gerente: " + nome + ", Idade: " + idade + ", Salário: " + salario + ", Departamento: " + departamento);
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println(nome + " está sendo avaliado.");
    }

    @Override
    public void treinar() {
        System.out.println(nome + " está participando de um treinamento.");
    }
}
