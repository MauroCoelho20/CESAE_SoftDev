package Ex08;

public class Main {
    public static void main(String[] args) {
        Aluno Paulo = new Aluno("Paulo", 17, "Informatica", 9.5);
        Paulo.situacao();

        System.out.println("----------------------------------------------------");

        Aluno Rui = new Aluno("Rui", 18, "Informatica", 5);
        Rui.situacao();
    }
}
