/*
this algo is used to find the prime numbers
 */

package Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleSieve {
    public static void main(String[] args) {
        int n = 50;
        boolean[] x = new boolean[n+1];
        for (int i = 2; i<=Math.sqrt(n);i++) {
            if(x[i]!= true) {
                for (int j = i*i; j <=n ; j=j+i) {
                    x[j]=true;
                }
            }
        }
        int count = 0 ;
        for (int i = 2; i <=n; i++) {
            if(x[i]!=true) {
                System.out.println(i);
                count ++ ;
            }
        }
        System.out.println("total prime"+ " " + count);


    }
}
