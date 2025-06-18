package ex_11_Java_Basic;

import java.util.Scanner;

public class Lab_085_Task3_GradeCalculator {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        // A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59

        System.out.println("Enter the score of a student");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Score="+score + "\nGrade is F");
        }
            else if (score > 80 && score < 89) {
            System.out.println("Score="+score + "\nGrade is B");
        }
            else if (score > 70 && score <= 79) {
            System.out.println("Score="+score + "\nGrade is C");
        }
            else if (score > 60 && score <= 69) {
                        System.out.println("Score="+score + "\nGrade is D");
            }
            else if (score<60 && score>=0)   {
            System.out.println("Score="+score + "\nGrade is F");
        }
            else {
            System.out.println("Score Entered is INVALID");
        }
    }
}
