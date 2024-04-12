package Algo;

import java.util.HashMap;

public class MajorityElementHashmap {
    public static void main(String[] args) {
        int [] arr = {1,1,3,1,1,2,1,1,1};
        System.out.println(majorityElement(arr));

    }
    static int majorityElement(int [] arr) {
        int ans = - 1 ;
        HashMap<Integer , Integer> frequency = new HashMap<Integer,Integer>();
        for (int i = 0 ; i< arr.length; i++) {
            if (frequency.containsKey(arr[i])) {
                frequency.put(arr[i] , frequency.get(arr[i]) + 1) ;
            } else {
                frequency.put(arr[i],1);
            } if (frequency.get(arr[i]) > arr.length/2) {
                ans = arr[i] ;
            }
        }
        return ans ;
    }
}
