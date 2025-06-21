package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_002 {

    /*Create a Java program that demonstrates various arithmetic and assignment operators.

**Requirements:**
            - Use +, -, *, /, % operators
- Demonstrate assignment operators (=, +=, -=, *=, /=)
- Show the results of each operation*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int sum = 0;
        int sub = 0;
        int mult = 0;
        int div = 0;
        int mod = 0;

        sum = num1+num2;
        System.out.println("Addition: " +sum);
        sub = num1-num2;
        System.out.println("Sustraction: " +sub);
        mult= num1*num2;
        System.out.println("Multiplication: " +mult);
        div = num1/num2;
        System.out.println("Division: " +div);
        mod = num1%num2;
        System.out.println("Modulus: " +mod);
    }
}
