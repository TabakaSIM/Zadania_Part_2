package pl.Tabaka.Zadania.MonteCarlo;

import java.util.Random;

/*
3. W internecie poszukaj co to jest metoda MonteCarlo.
Wylosuj 10 mln liczb i wylicz ich średnią - bez żadnych cudów - zwykłe liczenie średniej.
Później zrób to samo tylko wykorzystując podejście MonteCarlo.
 */
public class Main {
        public static void main (String[]args){
            double result=0;
            double[] tab = new double[10];
            for (int k=0;k<tab.length;k++) {
                Random rng = new Random();
                double suma = 0;
                for (int i = 0; i < 1000000000; i++) {
                    suma += rng.nextInt();
                }
                suma /= 10000000;
                result+=suma;
                System.out.println(suma);
            }
            System.out.println(result/tab.length);
    }

}
