package projexceptions;
import java.io.*;
import java.util.*;
/*
 * @author user
 */
abstract class A{
    int x=5,y=2;
    final int z=15;
    A(){
        System.out.println("Constructor of base class");
    }
    public void change(int X,int Y){
        x=X;
        y=Y;
    }
     abstract void calculate();
}
interface B{
    int i=10;
    void chnge(int a);
    void calc();
}
public class ProjExceptions  extends A implements B{
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*ArrayList arr= new ArrayList();
        for(int i=0;i<5;i++){
            arr.add(br.readLine());
        }
        Iterator it= arr.iterator();
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o+" "+o.getClass());
            
        }*/
        A a =new A() {
            @Override
            void calculate() {
                int c=x+y+z;
                System.out.println(c);
            }
        };
        A o=new A(){
            @Override
            void calculate() {
                int p=x*y*z;
                System.out.println(p);
            }
            
        };
        B b=new B() {
            @Override
            public void chnge(int a) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void calc() {
                int prod=1;
                for(int x=1;x<=i;x++){
                    prod*=x;
                }
                System.out.println(prod);
            }
        };
        a.change(10, 5);
        a.calculate();
        o.change(10, 5);
        o.calculate();
        ProjExceptions p=new ProjExceptions();
        p.change(100, 63);
        p.calculate();
        b.calc();
        p.calc();
    }

    @Override
    void calculate() {
        int c=x-y;
        
        System.out.println(c);
    }

    @Override
    public void chnge(int a) {
        
    }

    @Override
    public void calc(){
        for(int x=1;x<=10;x++){
            System.out.println(i*x);
        }
    }

    
    
}


 /*
            
public static int calc(ArrayList<Integer> dividend,ArrayList<Integer> rem) {
        int x=1,j=0;
        while(true){
            System.out.println("Entered");
            for( j=0;j<5;j++){
                if((dividend.get(j)<0)||(rem.get(j)<0)){
                    assert x==1:"Can't execute";
                throw new ArithmeticException("No negeative numbers allowed");
                
                }
                if(dividend.get(j)%x!=rem.get(j)){
                    x++;
                    break;
                }
            }
            System.out.println(x+" "+j);
            if(j==5)
                return x;
        }
}
            ===============================Inside main==================
        try{
            Scanner sc=new Scanner(System.in);
            petrol obj=new petrol();
            if(obj.calc())
                System.out.println("Alliteration exists");
            else
                System.out.println("Alliteration does not exists");
            ArrayList<Integer> myArr=new ArrayList<Integer>();
            ArrayList<Integer> div=new ArrayList<Integer>();
            for(int i=0;i<5;i++){
                myArr.add(sc.nextInt());
            }
            for(int i=0;i<5;i++){
                div.add(sc.nextInt());
            }
            int r=calc(myArr,div);
            System.out.println(r);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getClass()+" "+e.getMessage());
        }
        finally{
            System.out.println("Code executed successfully");
        }    
*/