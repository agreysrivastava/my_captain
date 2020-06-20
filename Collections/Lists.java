package projvectors;
import java.util.*;
//Another List is LinkedList
//Lists are the collections with Iteration order
public class Lists {

    public static void Sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<Integer>();
        String str;
        while(true){
            str = sc.next();
            if(!(str.equals("#"))){
                int a = Integer.parseInt(str);
                lst.add(0,a);
            }
            else
                break;
        }
        for(int i=0;i<lst.size();i++){
            int b = lst.get(i);
            if(b==50){
                Sopln("Number found at "+(i+1)+"th position");
            }
        }
        if(lst.contains(50))
            Sopln("Number found at "+(lst.indexOf(50)+1)+"th position");
        Sopln(lst);
        List<Integer> lst2 = new ArrayList<Integer>(20);
        for(int i=1;i<=20;i++){
            if(i%2==1)
            lst2.add(i);
        }
        Sopln(lst2);
        lst.addAll(lst2);
        Sopln(lst);
        Iterator it = lst.iterator();
        while(it.hasNext()){
           if(lst.indexOf(50)==3){
               int x = lst.indexOf(50);
                lst.set(x, 500);
           }
           it.next();
        }
        List arr = Arrays.asList(1,2,3,4,5);
        
        Sopln(arr);
        Sopln(lst.subList(2, 6));
    }
    
}
