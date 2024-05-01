package Algo;

public class PalindromeBitwise {
    public static void main(String[] args) {
        binary(45);
        System.out.println(binary(45));
    }
    static int binary(int n) {
        String s = "" ;
        while(n>0) {
            s = Integer.toBinaryString(n & 1) + s ;
            n>>=1;
        }
        StringBuilder s1 = new StringBuilder(s);
        s1 = s1.reverse();
        return s.equals(s1.toString())?1:0;
    }
}
