package Algo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal(8));
    }
    static boolean pal(int n) {
        String s  = Integer.toBinaryString(n);
        int i = 0 ;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i) != s.charAt(j)) {
                return false ;
            }
            i++;
            j--;
        }
        return true ;
    }
}
