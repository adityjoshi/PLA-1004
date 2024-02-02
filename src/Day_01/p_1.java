package Day_01;

import java.util.Scanner;

import static Day_01.Adder.add;

public class p_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values of x & Y");
        int x = in.nextInt();
        int y = in.nextInt();
        Adder add = new Adder();
        System.out.println(add(x,y));

    }

}

class Adder {
    static int add(int x,int y) {
        return x+y ;
    }
}