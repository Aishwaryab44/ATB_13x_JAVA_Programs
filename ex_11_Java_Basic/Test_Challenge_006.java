package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_006 {
    /*Number Classification
    Write a program to check if a number is positive, negative, or zero.

**Requirements:**
            - Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case
*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(number< 0)
        {
            System.out.println("Numbber is negative");
        } else if (number==0) {
            System.out.println("Number is 0");

        }
        else {
            System.out.println("Number is positive");
        }
    }

}
