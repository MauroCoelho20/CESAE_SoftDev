package Ex09;

// A palavra 'public' significa que a classe pode ser usada por outras classes
public class Produto {
    private String nome;    // nome do produto (texto)
    private double preco;   // preço do produto (número com decimal)
    private int stock;      // quantidade em stock (número inteiro)

    // Este é o construtor da classe - é chamado quando criamos um novo produto
    // Ele recebe o nome e preço como parâmetros
    public Produto(String nome, double preco) {
        // this.nome se refere ao atributo nome da classe
        // nome (sem this) se refere ao parâmetro recebido
        this.nome = nome;     // guarda o nome recebido no atributo da classe
        this.preco = preco;   // guarda o preço recebido no atributo da classe
        this.stock = 0;       // inicia o stock com zero
    }

    // Método para comprar produtos e adicionar ao stock
    // recebe como parâmetro a quantidade a ser comprada
    public void comprar(int quantidade) {
        // Verifica se a quantidade é maior que zero
        if (quantidade > 0) {
            // Adiciona a quantidade ao stock atual
            stock = stock + quantidade;
            // Mostra mensagem informando que a compra foi realizada
            System.out.println("Compra realizada: " + quantidade + " unidades adicionadas ao stock");
        }
    }

    // Método para vender produtos e remover do stock
    // recebe como parâmetro a quantidade a ser vendida
    public void vender(int quantidade) {
        // Primeiro verifica se a quantidade é maior que zero
        if (quantidade > 0) {
            // Depois verifica se tem stock suficiente
            if (quantidade <= stock) {
                // Se tiver stock suficiente, diminui a quantidade do stock
                stock -= quantidade;
                // Mostra mensagem de venda realizada
                System.out.println("Venda realizada: " + quantidade + " unidades vendidas");
            } else {
                // Se não tiver stock suficiente, mostra mensagens de erro
                System.out.println("Erro: Não é possível realizar a venda por falta de stock");
                System.out.println("Stock atual: " + stock + " unidades");
                System.out.println("Quantidade solicitada: " + quantidade + " unidades");
            }
        }
    }

    // Método para mostrar quanto tem em stock
    public void mostrarStock() {
        // Imprime na tela a quantidade atual em stock
        System.out.println("Quantidade atual em stock: " + stock + " unidades");
    }
}


