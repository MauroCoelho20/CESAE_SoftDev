package Ex01;

public class Main {
    public static void main(String[] args) {
        Carro mercedes = new Carro("mercedes", "A45", 2022, 2000, 450, 4.5, TipoCombustivel.DIESEL );
        Carro bmw = new Carro("BMW", "I8", 2023, 3000, 800, 0, TipoCombustivel.ELETRICO);


        mercedes.ligar();
        bmw.ligar();

        mercedes.corrida(bmw).exibirDetalhes();


    }
}
