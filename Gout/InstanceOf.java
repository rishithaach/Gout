package Gout;



public class InstanceOf {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);

        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
        // System.out.println(b instanceof C); //returns false

        System.out.println(c instanceof A);
        // System.out.println(c instanceof B); //returns false
        System.out.println(c instanceof C);
    }
    
}
