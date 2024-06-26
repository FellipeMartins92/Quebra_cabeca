package entities;

public class Movimentos {
   
    private boolean is_in_bounds(char[][] tabela, int x, int y) throws GameRules {

        if (x >= 0 && x < tabela.length && y >= 0 && y < tabela[0].length) {
            
            return true;

        }

        throw new GameRules("Está fora dos limites da matriz");
    }

    private boolean check_matriz_source(char[][] tabela, int x_source, int y_source) throws GameRules {

        if (tabela[x_source][y_source] != '-') {

            return true;

        }

        throw new GameRules("Source é igual ao caractere '-'");

    }

    private boolean check_matriz_target(char[][] tabela, int x_target, int y_target) throws GameRules {

        if (tabela[x_target][y_target] == '-') {

            return true;

        }

        throw new GameRules("Target é diferente de '-'");

    }

    private boolean check_equals(int x_source, int y_source, int x_target, int y_target) throws GameRules {

        if (x_source == x_target && y_source == y_target) {

            throw new GameRules("Mesma posição");

        }

        return true;

    }

    public void movimentar(char[][] tabela, int x_source, int y_source, int x_target, int y_target) throws GameRules {

        if (is_in_bounds(tabela, x_target, y_target) 
            && is_in_bounds(tabela, x_source, y_source)
            && check_equals(x_source, y_source, x_target, y_target)
            && check_matriz_target(tabela, x_target, y_target)
            && check_matriz_source(tabela, x_source, y_source)) {

            tabela[x_target][y_target] = tabela[x_source][y_source];

            tabela[x_source][y_source] = '-';
        }
    }
}

