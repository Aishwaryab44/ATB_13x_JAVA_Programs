package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_007 {
    /*Find Largest of Three Numbers
    Create a program to find the largest among three numbers using if-else statements.

**Requirements:**
            - Read three integers from user input
- Use nested if-else or if-else if statements
- Handle cases where numbers might be equal

    Examples:
    Input:
            15 27 19
    Output:
    Largest number is: 27
    Explanation: Program finds 27 as the largest among the three numbers*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println("Largest number is" +a);
        } else if (b>a && b>c) {
            System.out.println("Largest number is" +b);


        }
        else {
            System.out.println("Largest number is" +c);
        }
    }
}
