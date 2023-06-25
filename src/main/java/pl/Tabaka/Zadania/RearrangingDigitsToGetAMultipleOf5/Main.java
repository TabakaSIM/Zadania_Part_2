package pl.Tabaka.Zadania.RearrangingDigitsToGetAMultipleOf5;

/*
Problem:
Given a positive integer N, MoEngage wants you to determine if it is possible to rearrange the digits of N
(in decimal representation) and obtain a multiple of 5.

For example, when N=108, we can rearrange its digits to construct 180=36⋅5 which is a multiple of 5.

Input Format:
    The first line contains an integer TT, the number of test cases. The description of the TT test cases follow.
    Each test case consists of two lines
    The first line contains a single integer DD, the number of digits in NN.
    The second line consists of a string of length DD, the number NN (in decimal representation). It is guaranteed that the string does not contain leading zeroes and consists only of the characters 0,1,…90,1,…9.

Output Format:
    For each test case, print YesYes if it is possible to rearrange the digits of NN so that it becomes a multiple 55. Otherwise, print NoNo.

You may print each character of the string in uppercase or lowercase (for example, the strings YeSYeS, yEsyEs, yesyes and YESYES will all be treated as identical).
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(funtion(814));
    }

    private static boolean funtion(int n) {
        while(true){
            if(n==0) return false;
            if(n%5==0) return true;
            n=n/10;
        }
    }
}
