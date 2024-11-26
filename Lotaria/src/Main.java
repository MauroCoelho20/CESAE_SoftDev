import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op;
        do {
            System.out.println("Bem-Vindo");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinha");
            System.out.println("0-Sair");
            op = in.nextInt();
            if (op == 0) {
                return;
            }
            if (op == 1) {
                Lotaria ();
            } else if (op == 2) {
               Raspadinha ();
            } else {
                System.out.println("Opção Invalida!");
            }
        } while(op != 0);

    }

    private static void Lotaria() {
        System.out.println("Bem-Vindo a Lotaria");
        System.out.println("Escolha um número, sendo o limite minimo 1000");
        int min = 1000;
        int max = 9999;
        int premio = 4567;

        if ()
        }

    }

    private static void Raspadinha() {

    }


}