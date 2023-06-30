package pl.Tabaka.Zadania.LiczbaPi;

import java.util.Random;

/*
4. BARDZO TRUDNE DLA CHĘTNYCH - Masz funkcję która potrafi losować liczby od 0 do 1 (zmiennoprzecinkowe, użyj Random w Java). Oblicz wartość liczby PI.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(normalPi());
        System.out.println();
        System.out.println(integralPi());
        /*int counter=0;
        for(int i=0;i<100;i++){
            if(Math.abs(Math.PI-normalPi())<Math.abs(Math.PI-integralPi())){
                counter++;
            }
            System.out.println(i + "%");
        }
        System.out.println(counter);*/  // Wyszło 2
    }

    public static double normalPi(){
        Random rng = new Random();
        double counter=0;
        int field = 100000000;
        for (int i=0;i<field;i++){
            if(Math.pow(rng.nextDouble(1)-0.5,2)+Math.pow(rng.nextDouble(1)-0.5,2)<=0.25){
                counter++;
            }
        }
        return counter*4/field;
    }

    public static double integralPi(){
        Random rng = new Random();
        double counter=0;
        int divisionInterval =10000;
        /*for(int i=0;i<divisionInterval;i++){
            for(int j=0;j<divisionInterval;j++){
                if(Math.pow(((double)i)/divisionInterval+rng.nextDouble(1)/divisionInterval-0.5,2)+Math.pow(((double)j)/divisionInterval+rng.nextDouble(1)/divisionInterval-0.5,2)<=0.25
                ){
                    counter++;
                }
            }
        }*/
        for(double i=0;i<1;i+=1.0/divisionInterval){
            for(double j=0;j<1;j+=1.0/divisionInterval){
                if(Math.pow(i+rng.nextDouble(1)/divisionInterval-0.5,2)+Math.pow(j+rng.nextDouble(1)/divisionInterval-0.5,2)<=0.25
                ){
                    counter++;
                }
            }
        }

        return counter*4/Math.pow(divisionInterval,2);
    }
}
