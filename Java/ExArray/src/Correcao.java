public class Correcao {
    static Scanner in = new Scanner(System.in);
    static int[] numeros;

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("Bem-vindo");
            System.out.println("Escolha uma opção");
            System.out.println("1-Ler Ficheiro de Texto para uma única string");
            System.out.println("2-Ler Ficheiro de Texto para um array de strings");
            System.out.println("3-Escreve um Texto");
            System.out.println("4-Preenche um array de Strings");
            System.out.println("5-Trocar os Conteúdos");
            System.out.println("0-Sair");
            op = in.nextInt();
            in.nextLine();

            if (op == 0) break;
            else if (op == 1) UnicoArray();
            else if (op == 2) ArrayStrings();
            else if (op == 3) Escrever();
            else if (op == 4) Preencher();
            else if (op == 5) Trocar();
            else System.out.println("Opção inválida");

        } while (op != 0);
    }
}