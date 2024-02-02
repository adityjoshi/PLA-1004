package Day_01;

public class operator {
    public static void main(String[] args) {
    int a = 10 ;
    int b = 20 ;
    int c = a+b;
    System.out.println(c);
    c += 1 ;
    System.out.println(c);

    if (a !=b ) {
        System.out.println("correct");
    } else {
        System.out.println("false");
    }
// bitwise
    int x = 2;
    int y = 2;
    System.out.println(x&y);
// shift operator
        // left shift  an x 2^b
        System.out.println(x << 1);
        // right shift  a / 2^b
        System.out.println(x>>1);
// Ternary operator
        System.out.println((x==y)?(x-1):(y));
    }
}
