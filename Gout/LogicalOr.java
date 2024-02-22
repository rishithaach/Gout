package Gout;

public class LogicalOr {
    public static void main(String[] args) {
        
        int a=10;
        int b=20;

        boolean t=true;
        boolean f=false;



        System.out.println("!t => "+!t);
        System.out.println("!f => "+!f);
        System.out.println("(Value of (a>b) "+(a>b)+" | Value of !(a>b) => "+!(a>b));
        System.out.println("(Value of (a<b) "+(a<b)+" | Value of !(a<b) => "+!(a<b));
    }
    
}
