package Algo;

public class PaliBitwise {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(9));

    }
    static boolean checkPalindrome(int num) {
        int reverseNum = 0 ;
        int realNum = num ;
        while (realNum > 0) {
            reverseNum <<= 1 ;
            reverseNum = (reverseNum) | (realNum & 1) ;
            realNum >>=1 ;
        }
        return reverseNum == num ;
    }
}
