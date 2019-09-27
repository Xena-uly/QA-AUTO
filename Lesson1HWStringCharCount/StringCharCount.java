import java.util.Random;

public class StringCharCount {
    public static void main(String[] args) {
    int letterAmount;
    String getString = createString();
    System.out.println(getString);
    letterAmount = charCount(getString);

    }
    public static String createString(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVW";
        String fullString = alphabet + alphabet.toLowerCase() + "0123456789";
        //System.out.println(fullString);
        Random rn = new Random();
        String stringRandom = "";
        int length = 10;
        for (int i = 0; i < length-1; i++) {
            stringRandom = stringRandom + fullString.charAt(rn.nextInt(fullString.length()));
        }
        return stringRandom;
    }
    public static int charCount(String str) {
       int count = 0;
       char [] charStr = str.toLowerCase().toCharArray();
        for (int i=0; i<str.length(); i++) {
            if (('a' <= charStr[i]) && (charStr[i]<='z')) {
                count++;
            }
        }
        if (count==0) {
            System.out.println("There is no letters in the string");
        } else {
            System.out.println("The letter amount = " + count);
        }
        return count;
    }

}
