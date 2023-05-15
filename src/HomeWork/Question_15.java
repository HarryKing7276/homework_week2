package HomeWork;

import java.util.Scanner;

public class Question_15
{
        /**
         * a Java program to swap two variables.
         */
            public static void swap()
            {
            System.out.println("Enter first number: ");
            Scanner sw = new Scanner(System.in);
            int a = sw.nextInt();
            System.out.println("Enter second number: ");
            int b = sw.nextInt();
            int temp = a;
            a = b;
            b = temp;
            System.out.println("first number is : "+ a);
            System.out.println("second number is : "+ b);

            }
            public static void main(String[] args)
        {
            swap();
        }
}



