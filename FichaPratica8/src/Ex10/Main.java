package Ex10;

public class Main {
    public static void main(String[] args) {

        Funcionario Mauro = new Funcionario("Mauro", 2000, "Informatica");

        Mauro.exibirDetalhes();

        Mauro.aumentarSalario(20);

        Mauro.exibirDetalhes();
    }
}
