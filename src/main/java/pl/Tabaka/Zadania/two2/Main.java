package pl.Tabaka.Zadania.two2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        two2(1, 2, 3);
        two2(2, 3, 5, 7, 11);
    }
    static int[] two2(int ... tab){
        return Arrays.stream(tab).map(i -> i*2).filter(i -> i%10!=2).peek(System.out::println).toArray();
    }
}
