import java.io.*;
import java.util.Scanner;

public class ProjFile {
   
    public static String readBr(File fp){
        String str1,str2="";
        try{
            BufferedReader br =new BufferedReader(new FileReader(fp));
            while((str1=br.readLine())!=null){
                System.out.println(str1);
                str2=str2+"\n"+str1;
            }
            System.out.println("This was BR output\n");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            return str2;
        }
    }
    public static void readFR(File fp){
        try{
            FileReader fr=new FileReader(fp);
            int i;
            while((i=fr.read())!=-1){
                 
                System.out.print((char)i);
            }
            System.out.println();
            System.out.println("This was FR output\n");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void readSC(File fp){
        try{
            Scanner sc=new Scanner(fp);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            System.out.println("This was SC output\n");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            File f=new File("nw.txt");
            File f1= new File("nw1.txt");
            readSC(f);
            System.out.println(f.getAbsolutePath());
            FileWriter fw= new FileWriter(f,true);
            System.out.println("Enter the text to be entered");
            String str= sc.nextLine();
            if(f.length()==0)
                fw.write(str);
            else
                fw.write("\n"+str);
            fw.close();
            System.out.println("====================");
            
                String con=readBr(f);
            System.out.println("====================");
            if(f.canRead())
            readFR(f1);
            FileWriter fw1= new FileWriter(f1);
            fw1.write(con);
            fw1.close();
            readFR(f1);
            //fp.delete();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
/*
class MyCalculator {
    public static long power(int n,int p)throws Exception{
        long prod=1;
        if(n==0&&p==0){
            //System.out.println(".");
            throw new Exception("n and p should not be zero.");
        }
        else if(n<0||p<0){
            //System.out.println("");
            throw new Exception("n or p should not be negative.");
        }
        else{
            for(int i=0;i<p;i++){
                prod=prod*n;
            }
        }
        return prod;
    }
    
}
class NewClass{
    static MyCalculator my_calculator = new MyCalculator();
    static Scanner in = new Scanner(System.in);
    public static void foo(){
    while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                long res=my_calculator.power(n, p);
                System.out.println(res);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
*/