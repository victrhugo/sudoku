package br.com.dio;

public class TabuleiroSudoku {

    private final int[][] tabuleiro;

    public TabuleiroSudoku() {
        this.tabuleiro = new int[9][9];
    }

    public void inserir(int x, int y, int valor, boolean fixo) {
        if (x >= 0 && x < 9 && y >= 0 && y < 9) {
            tabuleiro[y][x] = valor;
        }
    }

    public void exibir() {
        System.out.println("┌───────┬───────┬───────┐");
        for (int i = 0; i < 9; i++) {
            System.out.print("│ ");
            for (int j = 0; j < 9; j++) {
                int val = tabuleiro[i][j];
                System.out.print((val == 0 ? "." : val) + " ");
                if ((j + 1) % 3 == 0) System.out.print("│ ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != 8)
                System.out.println("├───────┼───────┼───────┤");
        }
        System.out.println("└───────┴───────┴───────┘");
    }
}
