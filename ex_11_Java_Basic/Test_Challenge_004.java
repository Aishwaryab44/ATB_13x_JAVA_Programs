package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_004 {
    /*Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
            **Requirements:**
            - Show the difference between ++i and i++
            - Show the difference between --i and i--
            - Print values before and after operations
            Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
            */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Original: "+num1);

        System.out.println("Pre-increment: "+ ++num1);
        System.out.println("Post-increment: "+ num1++);
        System.out.println("Pre-decrement: "+ --num1);
        System.out.println("Post-decrement: "+ num1--);


    }
}
