import java.util.Scanner;
public class ProjPilot {

    public  void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char[] vow=new char[20];
        int k=0;
        for(int i= 0;i<str.length();i++){
            char ch= str.charAt(i);
            switch(ch){
            case 'A':
                
            case 'E':
                
            case 'I':
                
            case 'O':
                
            case 'U':
                vow[k] = ch;
                k++;
                break;
            }
            
        }
        System.out.println("Number of vowels:"+k);
        for(int i=0;i<k;i++)
            System.out.print(vow[i]+" ");
        
    }
}
 

/*
if(10>100){
            System.out.println("A is greater than B");
        }
        else if(100>10){
            System.out.println("B is greater than A");
        }
        else{
            System.out.println("Both are equal");
//int a= sc.nextInt();
        char b = sc.next().toUpperCase().charAt(0);
        //int b= sc.nextInt();        
        switch(b){
            case 'A':
                System.out.println(b);
            case 'E':
                System.out.println(b);
            case 'I':
                
            case 'O':
                
            case 'U':
                System.out.println("Vowel");
                break;
            
            default:
                System.out.println("Consonant");
        }
System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] cars = new int[size];
        int x;
        for(x =0;x<size;x++){
            cars[x] = sc.nextInt();
        }
        for(int i=0;i<size;i++ ){
            System.out.print(cars[i]+" ");
        }
        System.out.println();
        int[] num = {1,2,3,4,5};
        String[] cars2 = {};
//        }*/
