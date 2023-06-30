package pl.Tabaka.Zadania.Transaction;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        for (int i=0;i<5;i++) {
            new Transaction(DigestUtils.md5Hex("LOL" + rng.nextInt()));
        }
    }
}
