import java.util.Scanner;

public class main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            System.out.println("1-Ex01");
            System.out.println("2-Ex02");
            System.out.println("3-Ex03");
            System.out.println("4-Ex04");
            System.out.println("5-Ex05");
            System.out.println("6-Ex06");
            System.out.println("7-Ex07");
            System.out.println("8-Ex08");
            op = in.nextInt();

            if (op == 1) ex01();
            if (op == 2) ex02();
            if (op == 3) ex03();
           /* if (op == 4) ex04();
            if (op == 5) ex05();
            if (op == 6) ex06();
            if (op == 7) ex07();
            if (op == 8) ex08();*/
        }
    }

    private static void ex03() {
    }

    private static void ex02() {
        //2. Faça um programa que guarde num vetor os nomes de pelo menos 10 alunos da turma. Deve permitir ao
        //utilizador ao inserir o número do aluno (índice do vetor) indicar qual o nome do mesmo.

        String[] nomes = new String[10];


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira um Nome" );
            nomes[i] = in.next();
        }



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