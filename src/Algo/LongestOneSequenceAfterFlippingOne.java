package Algo;

public class LongestOneSequenceAfterFlippingOne {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,0,1,1,1};
        int k = 1 ;
        System.out.println(longestSeq(arr,k));
    }
    static int longestSeq(int [] arr, int k) {
        int max = 0 ;
        int flip = 0 ;
        int start = 0 ;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 0) {
                flip ++ ;
            } while (flip > k) {
                if (arr[start] == 0) {
                    flip -- ;
                }
                start++ ;
            }
            max = Math.max(max, end-start+1) ;
        }
        return max ;
    }
}
