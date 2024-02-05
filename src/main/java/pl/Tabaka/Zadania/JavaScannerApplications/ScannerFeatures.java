package pl.Tabaka.Zadania.JavaScannerApplications;

import java.util.Scanner;
import java.io.*;

public class ScannerFeatures {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        try {
            System.out.println(myFile.createNewFile());
        } catch (RuntimeException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(myFile.getPath());

        try {
            Scanner scanner = new Scanner(myFile);
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku!");
        }

        System.out.println("Konie programu!");
    }
}
