package HomeWork;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CalculatorProgram {
    /**
     * 5.0 Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods. (Note: Two static and Two instance methods.)
     */
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " is : " + ans);
    }

    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two numbers " + a +  " and " + b + "  is : " + ans);
    }

    public static void division(int a, int b) {
        int ans = a / b;
        System.out.println("Division of two numbers  " + a + " and " + b + " is : "+ ans);

    }

    public static void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two numbers  " + a + " and " + b +  " is : " + ans);
    }
    public static void number(){
        System.out.println("Enter two Numbers:");
    }

    public static void main(String[] args) {
        number();
        Scanner sr = new Scanner(System.in);
        int a = (int) sr.nextDouble();
        int b = (int) sr.nextDouble();
        CalculatorProgram cal = new CalculatorProgram();
        cal.addition(a,b);
        cal.subtraction(a,b);
        division(a,b);
        multiplication(a,b);
    }

}
