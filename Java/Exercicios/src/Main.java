import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        {
            int op = 1;
            while (op != 0) {
                System.out.println("1-Exercicio 01");
                System.out.println("2-Exercicio 02");
                System.out.println("3-Exercicio 03");
                System.out.println("4-Exercicio 04");
                System.out.println("5-Exercicio 05");
                System.out.println("6-Exercicio 06");
                System.out.println("7-Exercicio 07");
                System.out.println("8-Exercicio 08");
                op = in.nextInt();

                if (op == 1) ex01();
                if (op == 2) ex02();
                if (op == 3) ex03();
                if (op == 4) ex04();
                if (op == 5) ex05();
                if (op == 6) ex06();
                if (op == 7) ex07();
            /*if (op == 8) ex08();*/
            }
        }
    }

    private static void ex07() {
       // 7. Faça um programa que peça ao utilizador um conjunto de nomes. Sempre que o utilizador insere um nome deve
        //inserir num outro vetor a 1ª letra de cada nome. Permita ao utilizador escrever o conteúdo de cada vetor. Sugerese a utilização de um menu.

        
    }

    private static void ex06() {
        //6. Faça um programa que peça ao utilizador um conjunto de nomes e os guarda num vetor. De seguida sorteie uma
        //posição do vetor e escreva o nome que está nessa posição

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira um Nome: ");
            nomes[i] = in.next();

        }
           int numero = rnd.nextInt(nomes.length);
        System.out.println("A pessoa numero " +numero+ " é o " +nomes[numero -1]);

    }

    private static void ex05() {
        //5. Faça um programa que ordene de forma crescente e decrescente um vetor. Sugere-se pesquisa na internet pelo
        //tópico: “java bubble sort”

        int op = 1;
        while (op != 0) {
            System.out.println("1- Crescente");
            System.out.println("2- Decrescente");
            System.out.println("0- Volta ");
            op = in.nextInt();

            if (op == 0) break;
            if (op == 1) Crescente();
            if (op == 2) Decrescente();
            if (op > 2) break;
        }
    }

    private static void Decrescente() {
        int[] numbers = {5,7,8,9,2};
        for (int i = 0; i < numbers.length-1; i++)
        {
            for (int j = i+1; j < numbers.length; j++){

                if (numbers[i] < numbers[j])
                {
                    int aux = numbers[i];
                    numbers[i] = numbers [j];
                    numbers[j] = aux;
                }
            }
        }System.out.println(Arrays.toString(numbers));
    }

    private static void Crescente() {
        int[] numbers = {5,7,8,9,2};
        for (int i = 0; i < numbers.length-1; i++)
        {
        for (int j = i+1; j < numbers.length; j++){
            if (numbers[i] > numbers[j]){
              int aux = numbers[i];
              numbers[i] = numbers [j];
              numbers[j] = aux;
            }
        }
        }System.out.println(Arrays.toString(numbers));
        }
    private static void ex04() {
       // 4. Faça um programa que utilize uma estrutura de repetição para ler 50 números armazenando-os em um vetor e
        // calcule e exiba a média aritmética deles. Em seguida o programa deve apresentar todos os valores armazenados
       // no vetor que sejam menores que a média.

        int[] num = new int[50];
        int numero;
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            numero = rnd.nextInt(1,51);
            System.out.print(numero+ " ");
            num[i] = numero;
            soma += numero;
        }

        double media = (double) soma / num.length;
        System.out.println();
        System.out.println("A media de números é: " +media);

        System.out.println("Valores menores que a media são:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] < media) {
                System.out.print(num[i]+ " ");
            }
        }
        System.out.println();
    }

    private static void ex03() {
        //3. Faça um programa que receba 10 valores inteiros e os coloque em um vetor. Em seguida exiba-os em ordem
        // inversa à ordem de entrada

        int[] val = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um Valor Inteiro");
            val[i]=in.nextInt();
        }

        System.out.println("Dados em ordem inversa:");
        for (int i = 9 ; i >= 0; i--) {
            System.out.println(val[i]);
        }
    }


    private static void ex02() {
        //2. Faça um programa que guarde num vetor os nomes de pelo menos 10 alunos da turma. Deve permitir ao
        // utilizador ao inserir o número do aluno (índice do vetor) indicar qual o nome do mesmo.

        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o Nome que vai ficar com o Numero = " + i);
            nomes[i] = in.next();

        }
        System.out.println("Qual a posição que quer aceder?");
        int numins = in.nextInt();
        if (numins < 0 || numins > 9) {
            System.out.println("Erro, Insira um Numero entre 0 e 9");
        } else {
            System.out.println("O ALUNO DO NUMERO QUE INTRODUZIU É " + nomes[numins]);

        }
    }

    private static void ex01() {
        // 1. Faça um programa que peça ao utilizador três notas,
        // guarde-as num vetor e apresente a média final lendo as
        // notas do vetor.

        double[] notas = new double[3];
        double soma = 0;

        // Pedir ao utilizador as 3 notas e preencher no array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira uma nota");
            notas[i] = in.nextDouble();
            //soma += notas[i];
        }

        // Percorrer o array, ler todas as notas e adicionar cada uma ao acumulador
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Media: " + media);
    }
}