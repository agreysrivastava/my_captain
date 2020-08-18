import java.util.Scanner;

public class Main {
    public static void sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape r = new Shape(7);
        sopln(r.getName());
        Shape s =new Shape(5,78);
        sopln(s.getName());
        int radius = sc.nextInt();
        r.setSize(radius);
        s.setSize(sc.nextInt(),sc.nextInt());
        sopln(r.getSize()[0]);
        sopln(s.getSize()[0]+" "+s.getSize()[1]);
        sopln(s.getArea());
        sopln(r.getArea(r.getSize()[0]));
        sopln("Shape\tSize\tArea");
        sopln(r.getName()+"\t"+r.getSize()[0]+"\t"+r.getArea(r.getSize()[0]));
        sopln(s.getName()+"\t"+s.getSize()[0]+"X"+s.getSize()[1]+"\t"+s.getArea());
    }
}
