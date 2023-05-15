package HomeWork;

public class StaticVariables {
     /**
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement
     * 2.4 Declare the Main method
     * 2.5 Call the static method into the Main method and Run the programme.
     */
     static int a = 50;
     static int b = 100; // two static variables
    public static void s1(){ // static method
         System.out.println(a); // Called both static variables into the static method inside
                               //the print statement
        System.out.println(b);
     }

    public static void main(String[] args) {
        StaticVariables.s1(); // static method into the Main method
    }
}


