package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_011 {
    public static void main(String[] args) {
        /*Write a program to print numbers from 1 to N using a for loop.
**Requirements:**
- Read the value of N from user input
- Use for loop to print numbers from 1 to N
- Print numbers in a single line separated by spaces*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        for(int i=1; i<=N;i++)
        {
            System.out.println(i);
        }


    }
}
