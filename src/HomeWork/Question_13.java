package HomeWork;


import java.util.Scanner;

public class Question_13 {
        /**
         *  a Java program that takes three numbers as input to calculate and
         *  print the average of the numbers
         */
        public static void avg(){
            System.out.println("Enter first number: ");
            Scanner av1 = new Scanner(System.in);
            double a = av1.nextInt();
            System.out.println("Enter second number");
            double b = av1.nextInt();
            System.out.println("Enter third number");
            double c = av1.nextInt();
            double ans = (a+b+c)/3;
            System.out.println("The Average of these three numbers is: " + ans);

        }

        public static void main(String[] args) {
            avg();
        }
    }


