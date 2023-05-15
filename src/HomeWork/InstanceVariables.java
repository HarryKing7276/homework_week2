package HomeWork;

public class InstanceVariables {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare on instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method
     * 1.5 Call the above instance method into teh Main method and Run the programme.
     */
    int a = 10;
    int b = 20; // 2 instance variables
                // following is instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b); // called both instance variables in to instance method
    }

    public static void main(String[] args) { // main method
        InstanceVariables p = new InstanceVariables(); // object to call instance method
        p.m1();

    }
}
