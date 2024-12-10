import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Bem-Vindo");
            System.out.println("Escolha um dos seguintes Jogos");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinha");
            System.out.println("3-Raspadinha2");
            System.out.println("0-Sair");
            op = in.nextInt();
            if (op == 0) {
                return;
            }
            if (op == 1) {
                Lotaria ();
            } else if (op == 2) {
                Raspadinha ();
            }else if (op == 3) {
                Raspadinha2 ();
            } else {
                System.out.println("Opção Invalida!");
            }
        } while(op != 0);

    }



    private static void Lotaria() {
        System.out.println("Bem-Vindo a Lotaria");
        System.out.println("Escolha um número, sendo o limite minimo 1000");
        int premio = rnd.nextInt();
        int num = in.nextInt();
        int segundopremio = premio %1000;
        int terceiropremio = premio % 100;


        if (num < 1000 || num > 9999) {
            System.out.println("Tem de inserir um numero acima de 1000");
            return;
        }

        if (num == premio) {
            System.out.println("Parabens!!! Ganhou o Premio Maximo!!");
        } else if (num %1000 == segundopremio){
            System.out.println("Ganhou o Segundo Premio! O numero correto é " +premio);
        } else if (num %100 == terceiropremio){
            System.out.println("Ganhou o terceiro Premio! O numero correto é " +premio);
        } else {
            System.out.println("Não Ganhou Premio! O mumero correto era " +premio);
        }
    }

    private static void Raspadinha() {
        System.out.println("Bem Vindo a Raspadinha");
        System.out.println("Insira um numero de 1 a 9");

        int num = in.nextInt();

        if (num < 1 || num >  10) {
            System.out.println("Tem de Inserir um numero de 1 a 9");
            return;
        }
        int premioTotal=0;
        for (int n = 0; n < 5; n++){
            int numaleatorio = rnd.nextInt(1,10);
            int premio = rnd.nextInt(1,100);

            System.out.println("Número: "+numaleatorio+" Prémio: "+premio+ "€");

            if (num == numaleatorio) {
               premioTotal+=premio;
            }
        }
        System.out.println("Prémio Total: "+premioTotal+ "€");



    }

    private static void Raspadinha2() {

    }

}

