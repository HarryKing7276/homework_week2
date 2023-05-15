package HomeWork;

public class Question_18
{    /**  18. Write a Java program to print the sum (addition), multiply, subtract, divide
 *       and remainder of two numbers.
 *       Test Data: Input first number: 125 Input second
 *       number:
 *       24 Expected Output :
 *       125 + 24 = 149
 *       125 - 24 = 101
 *       125 x 24 = 3000
 *       125 / 24 = 5
 *       125 mod 24 = 5
 */
  public static void run(){
     int a = 125; int b = 24;int c = a + b; int d = a - b; int e = a*b;
     int f = a/b; int g = a%b;
      System.out.println("125 + 24=" + c);
      System.out.println("125 - 24=" + d);
      System.out.println("125 * 24=" + e);
      System.out.println("125 / 24=" + f);
      System.out.println("125 % 24=" + g );


    }

    public static void main(String[] args) {
        run();
    }


}
