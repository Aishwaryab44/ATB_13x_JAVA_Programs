package ex_11_Java_Basic;

import java.util.Scanner;
//Create a program that determines whether a given year is a leap year.
// A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
// Use an if-else statement to make this determination.
public class Lab_084_Task3_Leap {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "Year is a leap year");
                } else {
                    System.out.println("Year is not leap");
                }
            } else {
                System.out.println("Year is a leap year");
            }
        }
                else
            {
                System.out.println("Year is not leap");
            }
        }
}

