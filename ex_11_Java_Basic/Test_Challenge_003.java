package ex_11_Java_Basic;

import java.util.Scanner;

public class Test_Challenge_003 {
   /* Write a program that demonstrates comparison and logical operators.
**Requirements:**
- Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)
- Print boolean results with explanatory messages
* a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        boolean result;
        result= (num1==num2);
        System.out.println("a == b:"+result);
        result= (num1>num2);
        System.out.println("a > b:"+result);
        result= (num1<num2);
        System.out.println("a < b:"+result);
        result=(num1>num2) && (num1>0);
        System.out.println("(a > b) && (a > 0):"+result);
        result = (num1<num2) || (num1>0);
        System.out.println("(a<b)||(a>0)"+result);
         result = !(num1>num2);
        System.out.println("!(a > b)"+result);
    }

}
