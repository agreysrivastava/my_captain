import java.util.*;
import projcaptain.myclass;
public class Car{
    String Name;
    int price;
    int gear;
    private String model;
    myclass o=new myclass();
    Car(){
        Name="Suzuki";
        price=90000;
        gear=5;
        
        System.out.println("Constructor of Parent class ");
    }
   protected void setModel(String mod){
       model=mod;
   }
    protected String getMod(){
       return model;
   }
   public void printData(){
       o.Sopln(Name);
       o.Sopln(price);
       o.Sopln(gear);
   }
}
/*
========================================Code for ArrayList======================

static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String)

			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
*/
