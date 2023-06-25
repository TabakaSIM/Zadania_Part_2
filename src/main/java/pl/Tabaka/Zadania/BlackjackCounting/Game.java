package pl.Tabaka.Zadania.BlackjackCounting;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static final String key = "23456789TJQKA";
    int value = 0;
    Random rng = new Random();
    StringBuilder result = new StringBuilder();

    public Game() {
        while (true) {
            System.out.println("1. Dobierz karte");
            System.out.println("2. Zakoncz gre");
            System.out.println("0. Wyjdz");
            switch (new Scanner(System.in).nextLine()) {
                case "1":
                    add();
                    System.out.println(result);
                    System.out.println("Value: " + this.value);
                    if(end()) {
                        System.out.println(result.substring(0,3));
                        if(result.toString().equals("A A ")){
                            System.out.println("WYGRANA SPECJALNA!");
                        } else {
                            System.out.println("Przegrana!");
                        }
                        return;
                    }
                    continue;
                case "2":
                    System.out.println("Twoj wynik koncowy to: " + value);
                    return;
                case "0":
                    return;
                default:
                    System.out.println("Blad, niepoprawny znak");
                    continue;
            }
        }
    }

    private void add() {
        char c = key.charAt(rng.nextInt(key.length()));
        result.append(c).append(" ");
        value+= calculate(c);
    }

    private int calculate(char c) {
        switch (c){
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'T':
            case 'J':
            case 'Q':
            case 'K':
                return 10;
            case 'A':
                return 11;
            default:
                return 0;
        }
    }

    private boolean end(){
        return value>21;
    }

}
