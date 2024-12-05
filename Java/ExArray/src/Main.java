import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
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

    private static void Trocar() {
        //2. Crie uma aplicação que leia o conteúdo de dois ficheiros (a.txt e b.txt) e troque os seus conteúdos (o primeiro
        // ficheiro deve ficar com o conteúdo do segundo e vice-versa

        try {
            String conteudo1 = Files.readString(Path.of("text.txt"));
            String conteudo2 = Files.readString(Path.of("ex1.txt"));

            Files.writeString(Path.of("text.txt"), conteudo2);

            Files.writeString(Path.of("ex1.txt"), conteudo1);

            System.out.println("Conteúdo trocado com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());
        }

    }

    private static void Preencher() {
        //d. Preencher um array de strings e escrever cada linha num ficheiro

        String caminho = "text.txt";

        ArrayList<String> texto = new ArrayList<>();
        texto.add("Primeira Linha");
        texto.add("Segunda Linha");
        texto.add("Terceira Linha");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for(int i = 0; i < texto.size(); i++) {
                bw.write(texto.get(i));
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Conteudo do ficheiro:");
        for (String linha : texto) {
            System.out.println(linha);
        }
    }

    private static void Escrever() {
        //c. Escrever um texto digitado pelo utilizador e gravar o mesmo num ficheiro.

        System.out.println("Escreva um texto");
        String texto = in.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter( "text.txt" , true))) {
            bw.write(texto);

        } catch (IOException e) {
            System.out.println("Erro ao escrever o texto" );
        }
    }

    private static void ArrayStrings() {
    // b. Ler um ficheiro de texto para um array de strings, em que cada linha é uma posição do array, e o
        //apresente o seu conteúdo.

        String caminho = "text.txt";

        List<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
        String linha;

        while ((linha = br.readLine()) != null) {
            linhas.add(linha);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Conteudo do ficheiro:");
        for (String linha : linhas) {
            System.out.println(linha);
        }
    }

    private static void UnicoArray() {
    // a. Ler um ficheiro de texto para uma única string e o apresente o seu conteúdo.

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String linha;
            String texto = "";
            while ((linha = reader.readLine()) != null) {
                texto += linha + "\t";

            }System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());
        }
        }
    }

