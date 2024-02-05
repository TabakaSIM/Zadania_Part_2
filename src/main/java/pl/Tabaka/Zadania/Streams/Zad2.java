package pl.Tabaka.Zadania.Streams;

import java.util.Arrays;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {
        List<Emploee> list = Arrays.asList(
                new Emploee(1,"Mati", "Bereda", 4220),
                new Emploee(2,"Pati", "Hurta", 5500)
        );


    list.stream()
            .filter(x-> x.getSalary()<5000 && x.getSalary()>4000)
            .peek(x -> x.setSalary(4800))
            .map(Emploee::getId)
            .forEach(System.out::println);
    }


}
