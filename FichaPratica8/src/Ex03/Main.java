package Ex03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(10,5);
        Retangulo retangulo2 = new Retangulo(20,10);

        System.out.println("Perimetro: " + retangulo1.perimetro());

        System.out.println("Area: " + retangulo2.area());
    }
}
