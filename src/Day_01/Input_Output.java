package Day_01;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of Integer:");
        int x = in.nextInt();

        // Consume the newline character left in the buffer
        in.nextLine();

        System.out.println("Enter the value of String:");
        String ram = in.nextLine();

        System.out.println("Integer value: " + x);
        System.out.println("String value: " + ram);
    }
}

