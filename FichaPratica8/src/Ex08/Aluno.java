package Ex08;

public class Aluno {
    private String nome;
    private int Idade;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.Idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String situacao() {

        if (this.media >= 9.5) {
            return "Aprovado!";

        }else {
            return "Reprovado!";
        }
    }
}
