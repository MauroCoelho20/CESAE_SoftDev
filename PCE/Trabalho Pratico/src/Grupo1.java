import java.util.*;

import static java.util.Collections.*;

public class Grupo1 {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("\n Bem-vindo ao EuroMilhoes \n");
            System.out.println("Escolha uma opção");
            System.out.println("1- Simulaçao do Sorteio");
            System.out.println("2- Insira os Numeros para Jogar");
            System.out.println("3- Preencher Automatico o Boletim");
            System.out.println("4- Simulador");
            System.out.println("0- Sair");
            op = in.nextInt();


            if (op == 0) break;
            else if (op == 1) Simulacao();
            else if (op == 2) InserirUti();
            else if (op == 3) Automatico();
            else if (op == 4) SimularX();
            else System.out.println("Opção inválida");

        } while (op != 0);
    }

    private static void SimularX() {

    }

    private static void Automatico() {

        int[] nums = new int[5];
        int[] chave = new int[2];

        for (int i = 0; i < nums.length; ) {
            int num = rnd.nextInt(50) + 1;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] == num) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                nums[i] = num;
                i++;
                System.out.println(i + "º Numero Gerado: " + num + "\n");
            }
        }
        for (int i = 0; i < chave.length; ) {
            int chaves = rnd.nextInt(12) + 1;
            boolean repetido = false;


            for (int j = 0; j < i; j++) {
                if (chave[j] == chaves) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                chave[i] = chaves;
                i++;
                System.out.println(i + "º Numero das Estrelas Gerada: " + chaves + "\n");
            }
        }
        Simulacao();
    }

    private static void InserirUti() {

        int[] nums = new int[5];
        int[] chave = new int[2];

        System.out.println("Insira 5 numeros entre (1 a 50)");
        for (int i = 0; i < nums.length; ) {
            System.out.println("Numero " + (i + 1) + ": ");
            int num = in.nextInt();

            if (num < 1 || num > 50) {
                System.out.println("Insira um numero entre (1 a 50)");
                continue;
            }
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] == num) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("Numero ja escolhido! Escolha outro");
            } else {
                nums[i] = num;
                i++;
            }
        }
        System.out.println("Insira uma Chave entre (1 a 12)");
        for (int i = 0; i < chave.length; ) {
            System.out.println("Chave " + (i + 1) + ": ");
            int chaves = in.nextInt();

            if (chaves < 1 || chaves > 12) {
                System.out.println("Insira um chave entre (1 a 12)");
                continue;

            }
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (chave[j] == chaves) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("Numero ja escolhido! Escolha outro");
            } else {
                chave[i] = chaves;
                i++;
            }
        }
        Simulacao();
    }

    private static void Simulacao() {

        List<Integer> nums = new ArrayList<>();
        List<Integer> chave = new ArrayList<>();

        while (nums.size() < 5) {
            int num = rnd.nextInt(50) + 1;
            if (!nums.contains(num)) {
                nums.add(num);
            }
        }
        while (chave.size() < 2) {
            int chaves = rnd.nextInt(12) + 1;
            if (!chave.contains(chaves)) {
                chave.add(chaves);
            }
        }
        Collections.sort(nums);
        Collections.sort(chave);

        System.out.println("Chave do Euromilhões: ");
        System.out.println("Numeros: " + nums);
        System.out.println("Estrelas: " + chave);
    }

}