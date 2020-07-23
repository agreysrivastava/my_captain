import java.util.Vector;

public class Vectors {
    public static void Sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args){
        Vector<Integer> vc = new Vector(15);
        Sopln(vc.capacity());
        for(int i=1;i<=15;i++){
            vc.add(0,i);
        }
        for (int i=16;i<=31;i++) {
            vc.add(i);
        }
        Sopln(vc.capacity());
        Sopln(vc.size());
        Sopln(vc);
        int ind = vc.size()/2;
        vc.add( ind,50);
        Sopln(vc);
        Vector vc_doub = new Vector();
        for(int i=0;i<31;i++){
            float doubl = (vc.get(i)+vc.get(i+1));
            vc_doub.add(doubl);
        }
        Sopln(vc_doub);
        vc.set(vc.lastIndexOf(50),100);
        Sopln(vc);
        Sopln(vc.contains(100));
        vc.remove(vc.indexOf(100));
        Sopln(vc);
        Sopln(vc.contains(100));
        vc.clear();
        Sopln(vc);
    }
}
