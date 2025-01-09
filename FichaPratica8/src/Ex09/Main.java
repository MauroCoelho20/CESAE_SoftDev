package Ex09;

public class Main {
    public static void main(String[] args) {
        // Criar um novo produto
        Produto produto = new Produto("Camiseta", 29.99);

        System.out.println("=== Teste de Operações ===");

        // b. Comprar 5 unidades
        System.out.println("\n1. Comprando 5 unidades:");
        produto.comprar(5);
        produto.mostrarStock();

        // c. Vender 2 unidades
        System.out.println("\n2. Vendendo 2 unidades:");
        produto.vender(2);
        produto.mostrarStock();

        // d. Comprar 10 unidades
        System.out.println("\n3. Comprando 10 unidades:");
        produto.comprar(10);
        produto.mostrarStock();

        // e. Tentar vender 35 unidades
        System.out.println("\n4. Tentando vender 35 unidades:");
        produto.vender(35);
        produto.mostrarStock();
    }

}
