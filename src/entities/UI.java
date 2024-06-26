package entities;

import java.util.Scanner;

public class UI {

    public static char[][] tabela = Game.final_setup();

    private static Movimentos move = new Movimentos();

    public static void PrintTabela(char[][] tabela){

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.print(" " + tabela[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void pegarMovimentos(Scanner sc) {
        try {
            System.out.print("Insira o Source x: ");
            int xSource = sc.nextInt();

            System.out.print("Insira o Source y: ");
            int ySource = sc.nextInt();

            System.out.print("Insira o Target x: ");
            int xTarget = sc.nextInt();

            System.out.print("Insira o Target y: ");
            int yTarget = sc.nextInt();

            move.movimentar(tabela, xSource, ySource, xTarget, yTarget);

        } catch (GameRules e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
            sc.next();
        }
    }

    public static void ClearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static String greetings(){
        return "Bem vindo ao jogo, o seu objetivo é deixar a matriz em ordem alfabética, deixando o '-' na última casa, boa sorte";
    }

}
