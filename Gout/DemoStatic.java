package Gout;

public class DemoStatic {

    static int id;
    String name;
    String dept;

    DemoStatic(String name,String dept){
        id=id+1;
        this.name=name;
        this.dept=dept;
    }

    public String getStudent(){
        return id +" " +this.name +","+this.dept;
    }
    public static void main(String[] args) {
        DemoStatic ds1=new DemoStatic("rishi", "cse");
        System.out.println(ds1.getStudent());

        DemoStatic ds2=new DemoStatic("gout", "ece");
        System.out.println(ds2.getStudent());

        DemoStatic ds3=new DemoStatic("abc", "mech");
        System.out.println(ds3.getStudent());
    }
}
