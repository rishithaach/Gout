package Gout;



public class Widening {

    public static String typeof(Object o){
        return o.getClass().getSimpleName();
    }; 
    
    public static void main(String[] args) {
        int i=1000;
        float f=i;
        long l=i;
        
        System.out.println("i :" + typeof((Object)i) + " "+i);
        System.out.println("f :" +typeof((Object)f)+ " "+f);
        System.out.println("l :" +typeof((Object)l)+ " "+l);


    }

}

