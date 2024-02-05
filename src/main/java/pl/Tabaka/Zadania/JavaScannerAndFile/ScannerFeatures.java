package pl.Tabaka.Zadania.JavaScannerAndFile;

import java.util.Scanner;
import java.io.*;

public class ScannerFeatures {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("src/main/java/pl/Tabaka/Zadania/JavaScannerAndFile/myFile.txt");
        Scanner scanner;
        System.out.println(myFile.getPath());

        try {
            scanner = new Scanner(myFile);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku!");
        }

        scanner = new Scanner(myFile);

        while(scanner.hasNext()) {
            for (String str : scanner.nextLine().split(" ")) {
                System.out.print(str + "-");
            }
            System.out.println();
        }
        System.out.println("Konie programu!");
    }
}
