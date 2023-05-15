package HomeWork;

public class TwoInstanceStatic {
    /**
     * 4.1 Declare tow instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare on static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     *     print statement.
     * 4.5 Declare the Main method.
     */
    int a  = 25;
    int b = 30;
    static  int c = 40;
    static int d = 50; //4.1.1

    public void i2(){ // 4.2
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
       public static void s2() { // 4.3
        TwoInstanceStatic t = new TwoInstanceStatic();
           System.out.println(t.a);
           System.out.println(t.b);
           System.out.println(c);
           System.out.println(d);
    }

    public static void main(String[] args) {
        s2();
        TwoInstanceStatic obj = new TwoInstanceStatic();
        obj.i2();
    }
}
