package HomeWork;

import java.util.Scanner;

public class RadiusValue {
    /** 6.0   Write a program to enter any radius value of the circle and find
     *        out the area.(Formula of Area A=PI*r*r).
     */
    public static void entNum(){
        System.out.println("Enter Radius value :");
    }
    public static void circleRadius(double r){
        double ans = Math.PI * r * r;
        System.out.println("The area of the circle is :" + ans);
    }

    public static void main(String[] args) {
        entNum();
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        circleRadius(r);

    }
}
