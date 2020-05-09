
public class Shape{
    private String name="Rectangle";
    private int a=0,b=0;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setSize(int A,int B){
        a=A;
        b=B;
    }
    public void setSize(int r){
        a=r;
    }
    public double getArea(){
        double area=Math.PI*a*a;
        return area;
    }
    public double getArea(int a, int b){
        double area=this.a*this.b;
        return area;
    }
}









/*
public class A {
    private int a=0;
    A(int x){
        a=x;
    }
    protected int disp(){
        return a;
    }
}
*/


/*
==========================Code for Matrix Hourglass==================

//0 1 0 1 0 1
//1 0 1 0 1 0
//1 0 1 0 1 0
//0 1 0 1 0 1
//0 1 0 1 0 1
//1 0 1 0 1 0
    static final Scanner scanner = new Scanner(System.in);
int[][] arr = new int[6][6];
        int max=0,sum;
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>max){
                    max=sum;
                    //System.out.println(arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+" "+arr[i+1][j+1]+" "+
                //arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]);
                }
            }
        }
        System.out.println(max);
        scanner.close();*/
