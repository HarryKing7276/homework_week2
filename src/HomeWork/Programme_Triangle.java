package HomeWork;

import java.util.Scanner;

public class Programme_Triangle{
    /** Write a program to calculate the area of a triangle.
     */
    public static void A5(){
        Scanner height = new Scanner(System.in);
        System.out.print("Enter height value:");
        double h = height.nextDouble();
        Scanner base = new Scanner(System.in);
        System.out.print("Enter base value:");
        double b = base.nextDouble();
        double Area = (b*h)/2;
        System.out.printf("Area of triangle is: %.2f", Area );
    }
    public static void main(String[] args){
        A5();
    }
}

