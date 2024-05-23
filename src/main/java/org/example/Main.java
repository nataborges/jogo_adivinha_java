package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random() * 1000);
        int tentativa;

        System.out.println("-------------------------------");
        System.out.println("|  👀 JOGO DA ADIVINHACAO  👀 |");
        System.out.println("-------------------------------");
=======
        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;

        System.out.println("-------------------------");
        System.out.println("|  JOGO DA ADIVINHACAO  |");
        System.out.println("-------------------------");
>>>>>>> 83b320eb0e616e21a145abdf44a5dbb132f89563
        System.out.println();
        System.out.println("Regras do jogo!");
        System.out.println("1- Vou pensar em um número");
        System.out.println("2- Você tenta adivinhar qual número estou pensando");
        System.out.println("3- Te informo se acertou ou não");
        System.out.println("Está pronto para jogar?");
        System.out.println("Está pronto para jogar? (s/n)");
        pronto = leitura.next();

<<<<<<< HEAD
        switch (pronto) {
            case "s":
                jogo_for();
                    break;

                    case "n":
                            System.out.println("Até mais, então. 👍");
                            break;
                        default:
                            System.out.println("Opção inválida! 😒");

                }
        }
        public static void jogo_for(){

            Scanner leitura = new Scanner(System.in);
            String pronto;
            int resposta = (int) Math.round(Math.random() * 1000);
            int tentativa;

            for (int contador = 0; contador < 1000; contador++) {
                System.out.println("Qual número entre 0 e 1000 estou pensando?");
                tentativa = leitura.nextInt();
                if (tentativa == resposta) {
                    System.out.println("🎉Parabéns, você acertou!🎉");
                } else {
                    System.out.println("#############################");
                    System.out.println("##❌Que pena, você errou❌##");
                    System.out.println("#############################");
                    System.out.println("😜 - A reposta era " + resposta);
                }
                resposta = (int) Math.round(Math.random() * 1000);
            }
        }
    }
=======
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
>>>>>>> 83b320eb0e616e21a145abdf44a5dbb132f89563
