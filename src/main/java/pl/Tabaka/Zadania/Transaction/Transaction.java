package pl.Tabaka.Zadania.Transaction;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

public class Transaction{
    public double ammount;
    public String lastTransaction;  // To ma być jakiś hash
    public int nonce;

    public Transaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
        this.ammount = new Random().nextDouble();
        this.nonce=0;
        while(true){
            if(this.lastTransaction.substring(this.lastTransaction.length()-7,this.lastTransaction.length()).equals("0000000")){
                break;
            }
            nonce++;
            this.lastTransaction=DigestUtils.md5Hex(this.lastTransaction);
        }
        System.out.println(this.lastTransaction);
        System.out.println(this.nonce);
    }

    public String toString(){
        return "xD";
    }
}
