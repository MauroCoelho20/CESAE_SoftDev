package Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor", 25, 1.7);
        Pessoa pessoa2 = new Pessoa("Ana", 35, 1.55);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade()+ " anos");
        System.out.println(pessoa1.getAltura()+ " centimetros");

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade()+ " anos");
        System.out.println(pessoa2.getAltura()+ " centimetros");

       // pessoa1.setIdade(26);
    }
}
