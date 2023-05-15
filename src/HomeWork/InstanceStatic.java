package HomeWork;

public class InstanceStatic {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method
     * 3.3 Declare one static method
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     *     print statement
     * 3.5 Declare the main method
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 5; //3.1
    static int b = 10; //3.1
    public void i1(){ //3.2
        System.out.println(a); //3.4
        System.out.println(b); //3.4
    }
    public static void i2(){ // 3.3
        InstanceStatic obj = new InstanceStatic();
        System.out.println(obj.a); //3.4
        System.out.println(b); //3.4
    }
    public static void main(String[] args){ // 3.5
        InstanceStatic i3 = new InstanceStatic();
        i3.i1(); //3.6
        i2(); //3.6



    }
}
