
import java.io.*;
import java.util.*;
import projcaptain.myclass;
import projfeb.*;
import static java.lang.System.*;
 public class Suzuki extends Car {
         
     static myclass o=new myclass();
     Suzuki(){
         o.Sopln("Constructor of child class");
     }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        Shape c =new Shape();
        c.setName("Circle");
        Shape r= new Shape();
        Shape r1=new Shape();
        r1.setSize(1,50);
        c.setSize(10);
        r.setSize(20,30);
        double ar_c=c.getArea();
        o.Sopln(ar_c);
        double ar_r=r.getArea(5,10);
        o.Sopln(ar_r);
        double ar_r1=r1.getArea(10,20);
        o.Sopln(ar_r1);
        String str1=r1.getName();
        o.Sopln(str1);
        o.Sopln(c.getName());
        
        Car car=new Car();
        car.setModel("P100");
        o.Sopln(car.getMod());
        car.printData();
        Suzuki s=new Suzuki();
        s.printData();
        s.setModel("M200");
        o.Sopln(s.getMod());
        o.Sopln("");
        febclass f=new febclass();
        f.Sopln("Hello");
        out.println();
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