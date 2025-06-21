package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_010 {
    public static void main(String[] args) {
       /* Write a program to create a simple calculator using switch statement.

                **Requirements:**
        - Read two numbers and an operator (+, -, *, /)
        - Use switch statement to perform the operation
                - Handle division by zero
                - Display the result
    }
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 ");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+' :
                System.out.println("Result: " + a+b);
                break;
            case '-':
                int result = a-b;
                System.out.println("Result: "+result);
                break;
            case '*':
                 result = a*b;
                System.out.println("Result" +result);
                break;
            case '/':
                if(b!=0) {
                    result = a/b;
                    System.out.println("Result" + result);

                }
                else
                    System.out.println("Error: Division By Zero");
                break;
            default:
                System.out.println("Invalid Operator");

        }

    }
}
