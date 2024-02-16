package Algo;

import java.util.Arrays;


public class SegmentedSieve {
    public static void main(String[] args) {
       sieve(100);


    }


    static void sieve(int n){
        // Create a boolean array "sievearr[0..n]" and
        // initialize all entries it as true.
        boolean sievearr[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            sievearr[i] = true;

        for (int i = 2; i * i <= n; i++){
            // If sievearr[i] is not changed, then it is a
            // prime
            if (sievearr[i] == true){
                // If sievearr[i] is true make
                // the multiples of i as false which are less than or equal to n
                for (int j = i * i; j <= n; j += i)
                    sievearr[j] = false;
            }
        }

        // Print all prime numbers
        for (int prime = 2; prime <= n; prime++){
            //A value in
            // prime[i] will finally be false if i is Not a
            // prime, else true.
            if (sievearr[prime] == true)
                System.out.print(prime + " ");
        }
    }

}
