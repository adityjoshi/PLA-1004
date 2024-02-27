package Algo;

public class EulerPhi {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println("phi(" + i + ") = " + euler(i));
        }
    }
    static int gcd(int x, int y) {
        if (x==0)
            return y ;
        return gcd(y % x,x);

    }

    static int euler(int n) {
        int res = 1;
        for (int i = 2; i <n; i++) {
            if(gcd(i,n) == 1) {
                res++;

            }
        }
        return res;
    }
}
