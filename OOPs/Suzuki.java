import java.util.*;
import projcaptain.Car;
public class Suzuki extends Car {
    Suzuki(){
        sopln("Constructor of Child class");
    }
    public static void sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Car c = new Car();
        Suzuki s = new Suzuki();
        c.setData("Meredes", 6, 300000);
        s.setData("Suzuki", 6, 1000000);
        s.setModel("S200");
        sopln(s.getMod());
        c.printData();
        s.printData();
    }
}













/*String str;
        int i=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int[] myArr=new int[10];
        ArrayList array=new ArrayList(122);
        o.Sopln("Enter a String");
        str=br.readLine();
        for(;i<str.length();i++){
            char ch=str.charAt(i);
            if(!array.contains(ch)){
                array.add(ch);
            }
        }
        try{
        o.Sopln("Sopln Output: "+array);
        Iterator it = array.iterator();
        o.Sopln("Iterator output");
        while(it.hasNext())
            o.Sop(it.next()+" ");
        o.Sopln("");
        int j=array.indexOf('A');
        array.remove(j);
        o.Sopln("Output after removal of A");
        Vector vc=new Vector();
        vc.addAll(array);
        o.Sopln(vc);*/
        //o.asser(15);
        //o.asser(27);
        
        //}
        //catch(Exception e){
        //    o.Sop(e.getMessage());
       // }
/*int i=sc.nextInt();
        double d=sc.nextDouble();
        
        String str=sc.next();
        str+=sc.nextLine();
        o.Sopln(i);
        o.Sopln(d);
        o.Sopln(str);
        //=============code for Abstraction, encapsulation & Polymorphism================
        Shape rect=new Shape();
        Shape circ=new Shape();
        circ.setName("Circle");
        o.Sopln(rect.getName());
        o.Sopln(circ.getName());
        rect.setSize(10, 5);
        circ.setSize(7);
        o.Sopln(rect.getArea(10));
        o.Sopln(circ.getArea());
        
        //===============code for Inheritance=================
        Car suz=new Car();
        suz.printData();
        suz.Name="Suzuki";
        suz.gear=9;
        suz.price=100000;
        suz.printData();
        suz.setModel("A700");
        o.Sopln(suz.getMod());
        Suzuki s=new Suzuki();
        s.gear=6;
        
        s.printData();
        s.setModel("A800");
        o.Sopln(s.getMod());
        C c=new C();*/



































/*
Suzuki(){
        o.Sop("Constructor of child class");
    }
Shape a=new Shape();
        Shape a1=new Shape();
        
        a.setName("Circle");
        System.out.println(a.getName()+" "+a1.getName());
        a.setSize(7);
        a1.setSize(20, 10);
        System.out.println(a.getName()+" area is: "+a.getArea());
        System.out.println(a1.getName()+" area is: "+a1.getArea(20));
        Car c=new Car();
        System.out.println(c.Name+" "+c.gear+" "+c.price);
        c.setModel("Suzuki100");
        System.out.println(c.getMod());
        Suzuki s=new Suzuki();
        s.Name="Maruti";
        s.price=800;
        s.gear=6;
        s.setModel("800");
        System.out.println(s.Name+"  "+s.gear+"  "+s.price+"  "+s.getMod());
*/