package HomeWork;

public class Question_14 {
     /**
     *  a Java program to print the area and perimeter of a rectangle.
      *  Test Data: Width = 5.5 Height = 8.5
      *  Expected Output: Area is 5.6 * 8.5 = 47.60
      *  Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
        public void apr() {
        float ar = (float)(5.6 * 8.5);
        float pr =  (float) (2 * (5.6 + 8.5));
        System.out.println("Area is 5.6 * 8.5 = "  + ar);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) =  " + pr);
        }
        public static void main(String[] args) {
        Question_14 obj = new Question_14();
        obj.apr();
        }
}



