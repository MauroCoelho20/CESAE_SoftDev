import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    static Scanner in = new Scanner(System.in);
    //static int[] numeros;
    static ArrayList<Integer> numeros;

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Bem-vindo");
            System.out.println("Escolha uma opção");
            System.out.println("1-Ler Ficheiro Unica String");
            System.out.println("2-Ler Ficheiro Array de Strings");
            System.out.println("3-Escrever um Texto e Gravar");
            System.out.println("4-Preencher um Array de Strings");;
            System.out.println("0-Sair");
            op = in.nextInt();


            if (op == 0) break;
            else if (op == 1) Unico();         // OrdenarCrescente();
            //else if (op == 2) Array();         // OrdenarDecrescente();
            //else if (op == 3) Gravar();
            //else if (op == 4) Preencher();  //AdicionarFim();
            else System.out.println("Opção inválida");

        } while (op != 0);

    }

    private static void Unico() {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String linha;
            String texto = "";
            while ((linha = br.readLine()) != null){
                linha += texto + "\t";
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
