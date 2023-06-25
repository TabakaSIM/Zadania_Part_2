package pl.Tabaka.Zadania.KolkoKrzyzyk;

import java.util.Scanner;

public class Plansza {
    int[] tab;
    int winner;
    int counter;
    boolean finished = false;

    public Plansza() {
        this.tab = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.counter=0;
        this.printDefaultMenu();

        do {
            printMenu();
            askForMark();
            check();
        } while(winner==0 && counter<9);
        printMenu();
        printWinner();
    }

    private void askForMark() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pozycje: ");
        while (true){
            if(scan.hasNextInt()) {
                int liczba = scan.nextInt()-1;
                if(liczba<0 || liczba>8) {
                    System.out.println("Blad, podaj poprawna pozycje!");
                    continue;
                }
                if(tab[liczba]!=0){
                    System.out.println("Blad, pozycja zajeta! Podaj inna pozycje!");
                    continue;
                }
                tab[liczba]=counter%2+1;
                counter++;
                break;
            }
            scan.nextLine();
        }
        System.out.println("Pozycja przyjeta pomyslnie!");
        System.out.println("Wyswietlanie mapy:");
    }

    private void check() {

        for (int i=0;i<3;i++){
            if(tab[3*i]!=0 && (tab[3*i]==tab[3*i+1] && tab[3*i]==tab[3*i+2])){
                winner = tab[i];
                return;
            }
            if(tab[i]!=0 && (tab[i]==tab[3+i] && tab[i]==tab[6+i])){
                winner = tab[i];
                return;
            }
        }

        if(((tab[0]==tab[4] && tab[0]==tab[9])
        || (tab[2]==tab[4] && tab[2]==tab[6]))  && tab[4]!=0) {
            winner = tab[4];
            return;
        }
        return;
    }

    private void printWinner() {
        if (winner==0) System.out.println("Remis!");
        if (winner==1) System.out.println("Wygrywa grasz nr 1!");
        if (winner==2) System.out.println("Wygrywa grasz nr 2!");
    }

    private void printMenu(){
        StringBuilder string = new StringBuilder();
        for(int i=0;i<tab.length;i++){
            if((i+1)%3==0) {
                if(i==9) {
                    string.append(this.match(tab[i]));
                }
                else {
                    string.append(this.match(tab[i]))
                            .append("\n")
                            .append("-----")
                            .append("\n");
                }
            } else {
                string.append(this.match(tab[i]))
                        .append("|");
            }
        }
        System.out.println(string);
    }

    private String match(int i) {
        if(i==1) return "⚪";
        if(i==2) return "❌";
        return " ";
    }

    private void printDefaultMenu(){
        StringBuilder string = new StringBuilder();
        for(int i=1;i<tab.length+1;i++){
            if(i%3==0) {
                if(i==9) {
                    string.append(i);
                }
                else {
                    string.append(i)
                            .append("\n")
                            .append("-----")
                            .append("\n");
                }
            } else {
                string.append(i)
                        .append("|");
            }
        }
        System.out.println(string);
    }

}
