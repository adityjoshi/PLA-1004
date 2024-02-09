package Day_04;
// stairs program https://www.interviewbit.com/blog/climbing-stairs-problem/#:~:text=at%20a%20time%3F-,Problem%20Statement,of%20the%20steps%20taken%20matters.
public class Stairs {
    public static void main(String[] args) {
        System.out.println(stairs(5));
    }
    static int stairs(int n){
        if ( n < 2 )
            return 1;
        else
            return stairs(n-1) + stairs(n-2);
    }
}
