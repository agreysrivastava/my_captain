import java.io.*;

abstract class A{
    int i=10;
    String str = "Hello";
    public void print(Object o){
        System.out.println(o);
    }
    public abstract void calculate();
    public abstract void compare(A a);
}
interface B{
    int x =10;
    public void calc();
    public void comp();
}
public class ProjAbstract extends A implements B{

    public static void main(String[] args) throws IOException {
        A a = new A(){
            @Override
            public void calculate() {
                int prod=1;
                int x;
               for( x = i;x>1;x--){
                   prod=prod*x;
               }
               i++;
               print(prod);
            }
            @Override
            public void compare(A a) {
                if(this.i==a.i){
                    print(true+" i value is equal");
                }
                else
                    print(false+" value of i changed");
            }    
        };
        
        A a1 = new A(){
             @Override
            public void calculate() {
                float sum = i*(i+1)/2;
                str=str+" ";
                print(sum);
            }
            @Override
            public void compare(A a) {
                if(this.str.equals(a.str))
                    print(true+" str matched");
                else
                    print(false+" str changed");
            }  
        };
        a.compare(a1);
        a1.compare(a);
        a.calculate();
        a1.calculate();
        a.compare(a1);
        a1.compare(a);
        B b = new B() {
            @Override
            public void calc() {
                int prod=1;
                int i;
               for( i = x;i>1;i--){
                   prod=prod*i;
               }
               i++;
               a.print(prod);
            }
            @Override
            public void comp() {
                if(x==10)
                    a.print(true);
            }
        };
        b.calc();
        b.comp();
    }

    @Override
    public void calculate() {
        int prod=1;
                int x;
               for( x = i;x>1;x--){
                   prod=prod*x;
               }
               i++;
               print(prod);
               float sum = i*(i+1)/2;
                str=str+" ";
                print(sum);
    }

    @Override
    public void compare(A a) {
        if(this.i==a.i){
                    print(true+" i value is equal");
                }
                else
                    print(false+" value of i changed");
        if(this.str.equals(a.str))
                    print(true+" str matched");
                else
                    print(false+" str changed");
    }

    @Override
    public void calc() {
        int prod=1;
                int i;
               for( i = x;i>1;i--){
                   prod=prod*i;
               }
               i++;
               print(prod);
    }

    @Override
    public void comp() {
        if(x==10)
                    print(true);
        else
            print(false);
    }

}
