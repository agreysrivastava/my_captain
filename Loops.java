import java.util.Scanner;
public class ProjPilot {
/*
 *
 **
 ***
 ****
    */
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=4;i++){
            for(int k=4-i;k>0;k--){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('#');
            }
            System.out.println();
        }
        //==========================================Matrix=====================================
        int[][] mat = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
/*
long prod=1;
        System.out.println("Input taken" );        
        for(int i=1;i<=x;i++){
            prod= prod*i;
        }
        System.out.println("Factorial of "+x+" is : "+prod);
        prod=1;
        int j=1;
        while(j<=x){
            prod= prod*j;
            j++;
        }
        System.out.println("Factorial of "+x+" is : "+prod+" by while loop");
        prod=1;
        int y = sc.nextInt();
        int k=1;
        do{
            prod= prod*k;
            k++;
        }while(k<=y);
        System.out.println("Factorial of "+y+" is : "+prod+" by do-while loop");
===========================================Digit Sum======================================
int x=sc.nextInt();//1234 : 1+2+3+4=10 sum=10 y=0
        int y=x;
        int sum=0;
        while(y>0){
            sum=sum+y%10;
            y=y/10;
        }
        System.out.println("Digit sum of "+x+" is : "+sum+" by while loop");
*/
