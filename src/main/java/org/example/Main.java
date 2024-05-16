package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;

        System.out.println("-------------------------");
        System.out.println("|  JOGO DA ADIVINHACAO  |");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Regras do jogo!");
        System.out.println("1- Vou pensar em um número");
        System.out.println("2- Você tenta adivinhar qual número estou pensando");
        System.out.println("3- Te informo se acertou ou não");
        System.out.println("Está pronto para jogar?");
        System.out.println("Está pronto para jogar? (s/n)");
        pronto = leitura.next();

        switch (pronto){
            case "s":
                resposta =  100;
                System.out.println("Qual número entre 0 e 100 estou pensando?");
                tentativa = leitura.nextInt();
                if(tentativa == resposta){
                    System.out.println("parabéns, você acertou!");
                }
                break;
            case "n":
                    System.out.println("Até mais, então.");
                    break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}