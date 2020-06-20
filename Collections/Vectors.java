
package projvectors;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import static projvectors.Lists.Sopln;


public class Sample {
    Scanner sc=new Scanner(System.in);
       void f1(){
           Vector<Integer> vc=new Vector<Integer>(15);
        Vector<Integer> vc1=new Vector<Integer>();
        Sopln(vc.size());
        Sopln(vc.isEmpty());
        for(int i=0;i<10;i++){
            vc.add(0,i);
            vc1.add(0,i);
        }
        vc.addAll(vc1);
        Sopln(vc);
        int m=vc.indexOf(5);
        boolean eq=vc.isEmpty();
        Sopln(eq);
        vc.setElementAt(9999, m);
        List sub=vc.subList(5, 10);
        Sopln(sub);
        vc.removeAll(Arrays.asList(9,8));
        Sopln(vc);
        vc.clear();
        Sopln(vc+""+vc.size());
       }
}
