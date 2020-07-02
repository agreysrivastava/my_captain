
public class Shape{
    private String name="Rectangle";
    private int a=0,b=0;
    public void setName(int a, int b){
        if(a==b)
            name="Square";
    }
    public void setName(int r){
        name = "Circle";
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
    public int[] getSize(){
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        return arr;
    }
    public int getArea(){
        int res = a*b;
        return res;
    }
}
