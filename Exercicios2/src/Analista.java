public class Analista extends Funcionario implements Treinamento {
    public Analista(String nome, int idade, double salario, Departamento departamento) {
        super(nome, idade, salario, departamento);
    }

    @Override
    public double calcularBonusAnual() {
        return salario * 0.1;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Analista: " + nome + ", Idade: " + idade + ", Salário: " + salario + ", Departamento: " + departamento);
    }

    @Override
    public void treinar() {
        System.out.println(nome + " está participando de um treinamento.");
    }
}
