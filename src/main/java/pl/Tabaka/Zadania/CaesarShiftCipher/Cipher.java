package pl.Tabaka.Zadania.CaesarShiftCipher;

public class Cipher {
    static final String key = "abcdefghijklmnopqrstuvwxyz ";

    public Cipher(String string, int value) {
        StringBuilder result = new StringBuilder();

        for(char c : string.toCharArray()){
            int index = this.key.indexOf(c)+value;
            if(index>-1) {
                result.append(this.key.charAt(index % key.length()));
            } else {
                result.append(this.key.charAt(index + key.length()));
            }
        }
        System.out.println(result);
    }

}
