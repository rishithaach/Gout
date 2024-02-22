package Gout;

public class Narrowing {

    public static String typeof(Object o){
        return o.getClass().getSimpleName();
    }; 
    public static void main(String[] args) {
        //int to short
        int i=20;
        short s=(short)i;
        System.out.println("i : "+ i +" "+typeof((Object)i));
        System.out.println("s : "+ s +" "+typeof((Object)s));

        byte b=(byte)s;
        System.out.println("b: "+ b +" "+typeof((Object)b));

        
    }
    
}
