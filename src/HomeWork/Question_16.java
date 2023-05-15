package HomeWork;

public class Question_16 {
    /**
     * 16. Write a Java program to add two binary numbers.
     * Input Data: Input first binary number: 10
     * Input second binary number: 11
     * Expected Output: Sum of two binary numbers: 101
     */
    public static void bin(){
        // int x = 10
        // int y = 11
        int x = 0b10;
        int y = 0b11;
        int z = x + y;
        System.out.println("Sum of two binary numbers : " +Integer.toBinaryString(z));
    }

        public static void main(String[] args)
        {
            bin();
        }

    }



