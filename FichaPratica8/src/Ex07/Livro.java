package Ex07;

public class Livro {
     private String titulo = "Oi";
     private String autor = "Mauro";
     private String categoria = "Fight";
     private int Npaginas = 10;
     private String ISBN = "nao sei o que é";

    public Livro(String titulo, String autor, String categoria, int Npaginas , String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.Npaginas = Npaginas;
        this.ISBN = ISBN;

    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Npaginas: " + Npaginas);
        System.out.println("ISBN: " + ISBN);
    }
}
