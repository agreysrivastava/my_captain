import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
//byte, short,int, long float double boolean char
public class August{
    public static void Sopln(Object str){
        System.out.println(str);
    }
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
       Sopln("Enter a sentence");
       int vow=0,cons=0,space = 0;
       String sent = sc.nextLine();
        String sent1 = sent.toUpperCase();
       for (int i=0;i<sent.length();i++){

           char ch = (sent1.charAt(i));
           switch (ch){
               case 'A':
               case 'E':
               case 'I':
               case 'U':
               case 'O':
                   vow++;
                   break;
           }
       }
       Sopln("Vowels: "+vow);
       int j=0;
       while (j<sent.length()){
           char ch = (sent1.charAt(j));
           if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!=' ')
               cons++;
           j++;
       }
       Sopln("Consonants: "+cons);
       j=0;
       do{
           char ch = (sent1.charAt(j));
           switch (ch) {
               case ' ':
               space++;
           }
           j++;
       }while (j<sent.length());
       Sopln("Spaces: "+space);
       String[] words = sent.split(" ");
       for(String word:words)
           Sopln(word);
       for(int i=0;i<words.length;i++)
           Sopln(words[i]);
       Sopln(words.length);
    }
    public static int calc(int a,int b){
        return a+b;
    }
}
/*
int a,b,c;
        char X='+';
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(b=1;b<=10;b++){
            Sopln(a+X+b+"= "+a*b);//b=2
        }
        c=sc.nextInt();
        int sum=0;
        while(c>0){
            sum=sum+c%10;

            c=c/10;
            Sopln(sum+" "+c);
        }
        Sopln("Sum is: "+sum);
    System.out.println();
 */