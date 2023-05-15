package HomeWork;

public class TableOf10 {
    /**10. Write a Java program that takes a number as input and prints its multiplication table
     *     up to 10. Test Data: Input a number: 8
     *     Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
     */
    public static void tab(){
        int a=8;
        System.out.println("8 * 1  = " + a*1);
        System.out.println("8 * 2  = " + a*2);
        System.out.println("8 * 3 = " +  a*3);
        System.out.println("8 * 4  = " + a*4);
        System.out.println("8 * 5  = " + a*5);
        System.out.println("8 * 6  = " + a*6);
        System.out.println("8 * 7  = " + a*7);
        System.out.println("8 * 8  = " + a*8);
        System.out.println("8 * 9  = " + a*9);
        System.out.println("8 * 10  = "+ a*10);

    }

    public static void main(String[] args) {
        tab();
    }
}

