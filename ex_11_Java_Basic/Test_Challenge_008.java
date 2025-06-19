package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_008 {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if(year % 4 == 0 && year %100!=0 || year%400==0) {

                    System.out.println("Year is a leap year");
                }
             else {
                System.out.println("Year is not  a leap year");
            }

    }
}
