package Algo;

public class majorityElement {
    public static void main(String[] args) {
    int [] arr = {2,3,4,4,4,4,5,5};
    int n = arr.length;
        System.out.println(majorityElement(arr,n));
    }
    static boolean majorityElement(int [] arr, int n) {
        int maxCount = 0 ;
        int index = - 1 ;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2) {
            return true ;
        }

        return false;
    }

    }

