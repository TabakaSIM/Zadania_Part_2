package pl.Tabaka.Zadania.Game2048;

public class Main {
    public static void main(String[] args) {
        new Board();
        new Board(new int[][]{
                {2,2,2,2},
                {0,2,2,2},
                {0,4,2,4},
                {4,2,2,4}
        });

    }
}
