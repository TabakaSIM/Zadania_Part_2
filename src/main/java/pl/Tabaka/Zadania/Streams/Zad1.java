package pl.Tabaka.Zadania.Streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Zad1 {
    public static void main(String[] args) {
        String[] list = {"apvD. sd", "kawuia", "ops"};

        double result = Arrays.stream(list)
                    .filter(s -> !s.contains(" "))
                    .filter(s -> s.equals(s.toLowerCase()))
                    .map(s -> s.replaceAll("//.",""))
                    .map(s -> s.replaceAll("//,",""))
                    .mapToInt(String::length)
                    .average().orElse(0.0);
        System.out.println(result);
    }

}
