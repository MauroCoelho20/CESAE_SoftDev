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

        ArrayList<ArrayList<Integer>> numeroSolicitados = new ArrayList<>();
        ArrayList<ArrayList<Integer>> estrelasSolicitadas = new ArrayList<>();
        ArrayList<Integer> numero;
        ArrayList<Integer> estrela;

        System.out.println("Quantas apostas você quer fazer?");

        int numApostas = in.nextInt();

        if (numApostas >= 1 && numApostas <= 5) {

            for (int i = 0; i < numApostas; i++) {
                numero = new ArrayList<>();
                estrela = new ArrayList<>();

                while (numero.size() < 5) {
                    System.out.println("\n" + "Digite o " +(numero.size()+1)+ "º numero entre 1 e 50:");
                    int num = in.nextInt();
                    if (num >= 1 && num <= 50 && !numero.contains(num)) {
                        numero.add(num);
                    } else {
                        System.out.println("Número inválido ou repetido. Tente novamente.");
                    }
                }
                while (estrela.size() < 2) {
                    System.out.println("\n" + "Digite a " +(estrela.size()+1) + "ª estrela entre 1 e 12:");
                    int star = in.nextInt();
                    if (star >= 1 && star <= 12 && !estrela.contains(star)) {
                        estrela.add(star);
                    }else {
                        System.out.println("Numero inválido ou repetido. Tente novamente.");
                    }
                }
                Collections.sort(numero);
                Collections.sort(estrela);
                numeroSolicitados.add(numero);
                estrelasSolicitadas.add(estrela);
                System.out.println("A sua aposta é " + numeroSolicitados);
                System.out.println("A sua aposta é " + estrelasSolicitadas);
            }
        }
    }
        private static void Simulacao () {

            List<Integer> nums = new ArrayList<>();
            List<Integer> chave = new ArrayList<>();

            while (nums.size() < 5) {
                int num = rnd.nextInt(51);
                if (!nums.contains(num)) {
                    nums.add(num);
                }
            }
            while (chave.size() < 2) {
                int chaves = rnd.nextInt(13);
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