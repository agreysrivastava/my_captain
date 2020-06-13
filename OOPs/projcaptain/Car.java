package projcaptain;

import java.util.*;
public class Car{
    public String Name;
    int price;
    int gear;
    private  String model;
    myclass o=new myclass();
    public Car(){
        Name="Suzuki";
        price=90000;
        gear=5;
        model="M100";
        o.Sopln("Constructor of Parent class ");
    }
    public void setData(String name,int gear,int price){
        this.Name=name;
        this.gear=gear;
        this.price=price;
    }
  protected  void setModel(String mod){
       model=mod;
   }
    protected String getMod(){
       return model;
   }
   public void printData(){
       o.Sopln(Name);
       o.Sopln(price);
       o.Sopln(gear);
       o.Sopln(getMod());
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
