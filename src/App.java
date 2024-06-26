import java.util.Scanner;

import entities.Game;
import entities.UI;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        UI.tabela = Game.criar_tabela_jogo();

        System.out.println(UI.greetings());

       
        UI.PrintTabela(UI.tabela);

        while (!Game.verificar_igualdade(UI.tabela, Game.final_setup())) {

            UI.pegarMovimentos(sc);
            
            UI.PrintTabela(UI.tabela);

            UI.ClearScreen();

            UI.PrintTabela(UI.tabela);
        }

        sc.close();

        System.out.println("Parabéns, você completou o jogo!");
    }
}
