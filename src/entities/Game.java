package entities;

public class Game {

    public static char[][] final_setup(){

        char[][] tabela_modelo = new char[3][3];

        tabela_modelo[0][0] = 'a';
        tabela_modelo[0][1] = 'b';
        tabela_modelo[0][2] = 'c';
        tabela_modelo[1][0] = 'd';
        tabela_modelo[1][1] = 'e';
        tabela_modelo[1][2] = 'f';
        tabela_modelo[2][0] = 'g';
        tabela_modelo[2][1] = 'h';
        tabela_modelo[2][2] = '-';

        return tabela_modelo;

    }

    public static boolean verificar_igualdade(char[][] tabela,char[][] tabela_modelo){

        int count = 0;

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                if(tabela[i][j] == tabela_modelo[i][j]){
                    count++;
                }
            }
        }
        
        if(count == 9){
            return true;
        }

        return false;

    }

    public static char[][] criar_tabela_jogo(){

        char[][] tabela = new char[3][3];

        //feito para testar a lógica de terminar o jogo

        tabela[0][0] = 'a';
        tabela[0][1] = 'b';
        tabela[0][2] = 'c';
        tabela[1][0] = 'd';
        tabela[1][1] = 'e';
        tabela[1][2] = 'f';
        tabela[2][0] = 'g';
        tabela[2][1] = '-';
        tabela[2][2] = 'h';



        return tabela;


    }

}
