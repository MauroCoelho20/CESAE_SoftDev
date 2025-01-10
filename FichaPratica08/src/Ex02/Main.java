package Ex02;

public class Main {
    public static void main(String[] args) {
        Cao marcos = new Cao("Marcos","Bulldog");
        Cao mauro = new Cao("Mauro","Golden");
        Cao bruno = new Cao("Bruno","Pitbull");

        marcos.ladrar();
        mauro.ladrar("Arf Arf");
        bruno.ladrar("Ruff Ruff");
    }
}
