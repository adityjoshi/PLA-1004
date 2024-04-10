package Algo;

public class MaxEquilibriumOptimised {
    public static void main(String[] args) {
        int [] arr = {-2, 5, 3, 1, 2, 6, -4, 2 };
        System.out.println(optimised(arr));

    }
    static int optimised(int [] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for(int x: arr) {
            totalSum += x ;
        }
        for (int i = 0; i < arr.length; i++) {
             totalSum -= arr[i];
            if (leftSum == totalSum) {
                return Math.max(leftSum, arr[i]);
            }
            leftSum += arr[i];
        }

        return 0 ;
    }
}
