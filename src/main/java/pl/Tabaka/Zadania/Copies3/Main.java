package pl.Tabaka.Zadania.Copies3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (String s:copies3Stream("a", "bb", "ccc")) {
            System.out.println(s);
        }
        for (String s:copies3Stream("24", "a", "")) {
            System.out.println(s);
        }
        for (String s:copies3Stream("hello", "there")) {
            System.out.println(s);
        }
    }
    static String[] copies3(String ... tab){ //za pomoca petli
        for(int i=0;i<tab.length;i++){
            tab[i]=new StringBuilder(tab[i]).append(tab[i]).append(tab[i]).toString();
        }
        return tab;
    }
    static List<String> copies3Stream(String ... tab){ //za pomoca strumienia
        return Arrays.stream(tab).map(s -> new StringBuilder(s).append(s).append(s).toString()).toList();
    }
}
