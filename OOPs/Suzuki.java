import java.util.*;
import projcaptain.Car;
public class Suzuki  {
    
    public static void sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        Shape r = new Shape();
        sopln(r.getName());
        Shape c = new Shape();
        int radius = sc.nextInt();
        c.setName(radius);
        c.setSize(radius);
        Shape s = new Shape();
        sopln("Enter the size of the square");
        int size = sc.nextInt();
        s.setName(size,size);
        s.setSize(size, size);
        String name_square = s.getName();
        r.setSize(100, 10);
        sopln("r is a "+r.getName());
        sopln("c is a "+c.getName());
        sopln("s is a "+s.getName());
        sopln(s.getSize()[0]+" "+s.getSize()[1]);
        if(c.getName().equals("Circle"))
            sopln(c.getSize()[0]);
        sopln(r.getSize()[0]+" "+r.getSize()[1]);
        sopln("Area of rectangle is "+r.getArea());
        sopln("Area of Square is "+s.getArea());
        
    }
}
