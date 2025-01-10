package Ex10;

public class Funcionario {
    private String nome;
    private double salario;
    public String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double aumento) {
        this.salario += this.salario*(aumento/100);
    }
    public void exibirDetalhes() {
        System.out.println(this.nome + " | Departamento: " + this.departamento + " | Salario: " + this.salario);
    }
}
