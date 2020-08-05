import java.util.Scanner;
//byte, short,int, long float double boolean char
public class August {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = 89;
        c = calc(a,b);
        System.out.println("Sum is "+c);
    }
    public static int calc(int a,int b){
        return a+b;
    }
}
