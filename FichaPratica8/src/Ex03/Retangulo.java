package Ex03;

public class Retangulo {
    private int largura;
    private int altura;

    Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int perimetro() {
        return this.largura + this.altura + this.altura + this.largura;
    }

    public int area() {
        return this.largura * this.altura;
    }
}
