package Ex11;

public class Conta {
    private String iban;
    private double saldo = 0;
    private String titular;

    public Conta(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public void depositar (double valor) {
        this.saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }

    public void levantar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir (Conta contadeposito , double valor) {

    }
}
