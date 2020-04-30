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
            File fp=new File("nw.txt");
            File fi=new File("nw1.txt");
            FileWriter fw=new FileWriter(fp,true);
            String str=sc.nextLine();
            if(fp.length()!=0)
                fw.write("\n"+str);
            else
                fw.write(str); 
            fw.close();
            System.out.println(fp.getAbsolutePath());
            String out=readBr(fp);
            System.out.println("==================");
            readSC(fp);
            System.out.println("==================");
            readFR(fp);
            out=out.toUpperCase();
            FileWriter fw1=new FileWriter(fp);
            fw1.write(out);
            fw1.close();
            readSC(fp);
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