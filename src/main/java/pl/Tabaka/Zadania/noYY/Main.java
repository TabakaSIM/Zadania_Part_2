package pl.Tabaka.Zadania.noYY;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        noYY("a", "b", "cycy", "d");
        noYY("ya", "xx", "yy", "zz");
        noYY("yyx", "y", "zzz");
    }
    static List<String> noYY(String ... tab){
        //Arrays.stream(tab).filter(s -> !(s.matches(".*y.*y.*"))).map(s -> new StringBuilder(s).append("y").toString()).forEach(s -> System.out.print(s+" "));
        Arrays.stream(tab).map(s -> new StringBuilder(s).append("y").toString()).filter(s -> !(s.contains("yy"))).forEach(s -> System.out.print(s+" "));
        System.out.println();
        return Arrays.stream(tab).map(s -> new StringBuilder(s).append("y").toString()).filter(s -> !(s.contains("yy"))).toList();
    }
}
