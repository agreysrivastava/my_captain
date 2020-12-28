import java.util.ArrayList;
import java.util.Scanner;

abstract class A{
    public abstract int calcSum(ArrayList<Integer> arr);

}
interface B{
    public boolean compare(AbstractExample a,AbstractExample b);
}
class C implements B{

    @Override
    public boolean compare(AbstractExample a, AbstractExample b) {
        if(a.age==b.age){
            return true;
        }
        return false;
    }
}

public class AbstractExample extends A implements B {
    String name;
    int age;
    public static void main(String[] args) {
        System.out.println("Enter the numbers: # to stop");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList();
        while(true){
            String str = sc.nextLine();
            if(str.equals("#")){
                break;
            }
            int num = Integer.parseInt(str);
            arrayList.add(num);
        }
        AbstractExample abs = new AbstractExample();
        int res = abs.calcSum(arrayList);
        System.out.println(res);
        String name1= sc.nextLine();
        String name2 = sc.nextLine();
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        AbstractExample abs2 = new AbstractExample();
        abs.name = name1;
        abs.age = age1;
        abs2.name = name2;
        abs2.age = age2;
        boolean comparisonName = abs.compare(abs,abs2);
        C c = new C();
        boolean compAge = c.compare(abs,abs2);
        if(compAge && comparisonName){
            System.out.println("Both the person are same");
        }
        else if(compAge){
            System.out.println("Age matches but name does not");
        }
        else if(comparisonName){
            System.out.println("Name matches but age does not");
        }
        else{
            System.out.println("Nothing matches");
        }

    }

    @Override
    public int calcSum(ArrayList<Integer> arr) {
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

    @Override
    public boolean compare(AbstractExample a, AbstractExample b) {
        if(a.name.equalsIgnoreCase(b.name)){
            return  true;
        }
        return false;
    }
}
