package pl.Tabaka.Zadania.rightDigit;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for(int i:rightDigit(1, 22, 93)) {
            System.out.println(i);
        }
        for(int i:rightDigit(16, 8, 886, 8, 1)) {
            System.out.println(i);
        }
        for(int i:rightDigit(10, 0)) {
            System.out.println(i);
        }
    }
    static List<Integer> rightDigit(int ... tab){
        return Arrays.stream(tab).map(i -> i%10).boxed().toList();
    }
}
