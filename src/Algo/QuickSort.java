package Algo;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {2,3,0,3,4};
        int prefix = 0 ;
        int suffix = 1;
        int ans = 1;
        for (int i = 0; i < 5; i++) {
            if(prefix==0)
                prefix=1;
             if (suffix ==0 )
                suffix = 1;
            prefix = prefix *arr[i];
            suffix = suffix *arr[5-i-1];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        System.out.println(ans);
    }
}
