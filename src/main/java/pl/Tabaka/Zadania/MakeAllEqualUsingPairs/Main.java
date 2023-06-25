package pl.Tabaka.Zadania.MakeAllEqualUsingPairs;

/*
Problem:
Chef has an array A of length N.

In one operation, Chef can choose any two distinct indices i,j (1≤ i,j ≤N;i≠j)
and either change Ai to Aj or change Aj to Ai.

Find the minimum number of operations required to make all the elements of the array equal.
Input Format

    First line will contain TT, number of test cases. Then the test cases follow.
    First line of each test case consists of an integer NN - denoting the size of array AA.
    Second line of each test case consists of NN space-separated integers A1,A2,…,ANA1​,A2​,…,AN​ - denoting the array AA.


Output Format:
For each test case, output the minimum number of operations required to make all the elements equal.

*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(funtion(1,2,3));
        System.out.println(funtion(5,5,5,5));
        System.out.println(funtion(1,1,2));
    }

    private static int funtion(int ... tab) {
        int[] t = Arrays.copyOf(tab, tab.length);

        int countMax=0;

        for(int i=0; i<t.length; i++){
            if(t[i]!=-1){
                int count = 1;
                for (int j=i+1;j<t.length; j++){
                    if (t[i]==t[j]){
                        t[j]=-1;
                        count++;
                    }
                }
                if(countMax<count){
                    countMax=count;
                }
            }
        }

        return countMax==0 ? -1 : tab.length-countMax;
    }

}
