package projexceptionhandling;
import java.io.*;

class Sample{
    void Sopln(Object o){
        System.out.println(o);
    }
}
class MyExc extends Exception{
    String msg;
    MyExc(){
        msg="Numbers should be positive";
    }
    public String toString(){
        return msg;
    }
}
public class ProjExceptionHandling {

    static Sample s=new Sample();
    public static int calc(int[] arr,int[] rem) throws MyExc{
        for(int i=0;i<3;i++){
            if(arr[i]<0||rem[i]<0)
                throw new MyExc();
        }
        int x=1;
        while(true){
            int i;
            for( i=0;i<3;i++){
                if(x%arr[i]!=rem[i])
                    break;
            }
            if(i==3)
                return x;
            x++;
        }
        
    }
    public static void main(String[] args) throws IOException   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        try{
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        Throwable ev=new Exception();
        Object o=new Throwable();
        int c=a/b;
        s.Sopln(c+" is the result");
        int[] arr=new int[4];
        int[] rem=new int[4];
        //s.Sopln(arr[3]);
        String str="Enter the numbers";
        s.Sopln(str);
        
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        str="Enter the rem";
        s.Sopln(str);
        for(int i=0;i<3;i++){
            rem[i]=Integer.parseInt(br.readLine());
        }
        s.Sopln(calc(arr,rem));
        }
        
        catch(ArithmeticException e){
            s.Sopln(e.getMessage());
        }
        catch(NumberFormatException e){
            return ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            s.Sopln(e.getMessage());
        }
        catch(Exception e){
            s.Sopln(e.getClass()+" "+e.toString()+e.getCause());
            try{
            throw e;
            }
            catch(Exception ex){
                
            }
        }
        finally{
            s.Sopln("Program Executed Successfully");
        }
        s.Sopln("Hi");
    }
    
}
