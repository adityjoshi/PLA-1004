/*
{1,2,4,3,4,2,1}
left right diff
1 - 16 = 15
3 - 14 = 11
7 - 10 = 3
10 - 7 = 3

time - O(N^2)
space - O(N)
 */




package Algo;

public class MaxEquilibrium {
    public static void main(String[] args) {
        int [] arr = {-2, 5, 3, 1, 2, 6, -4, 2 };
        int n = arr.length;
        System.out.println(eq(arr,n));

    }
    static int eq(int [] arr, int n) {
        int res = 0 ;
        for (int i = 0; i < n; i++) {
            int leftSum = arr[i];
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            int rightSum = arr[i];
            for (int j = n-1; j > i; j--) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                res = Math.max(res,leftSum);
            }
        }
        return res ;
    }
}
