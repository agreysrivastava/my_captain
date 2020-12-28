import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hello {
    private static ArrayList phnBook ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phnBook = new ArrayList();
        int choice;
        do{
            System.out.println("Enter your choice:\n" +
                    "1. Add\n" +
                    "2. Update\n" +
                    "3. Delete\n" +
                    "4. Search\n" +
                    "5. Display All\n" +
                    "6. Exit");
             choice = sc.nextInt();
             sc.nextLine();
            switch (choice){
                case 1:
                    input();
                    break;
                case 2:
                    System.out.println("Enter the contact name you want to Update");
                    String oldName = sc.nextLine();
                    int i= search(oldName);
                    if(i!=-1){
                        System.out.println("Enter your Name: ");
                        String newName = sc.nextLine();
                        System.out.println("Enter your Number: ");
                        String newNum = sc.nextLine();
                        phnBook.set(i,newName+"\t"+newNum);
                    }
                    else{
                        System.out.println("Entry not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the contact name you want to delete");
                    String contact = sc.nextLine();
                    int ind= search(contact);
                    if(ind!=-1) {
                        phnBook.remove(ind);
                        System.out.println("Deleted");
                    }
                    else{
                        System.out.println("Entry not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the contact name you want to Search");
                    String contactName = sc.nextLine();
                    int index= search(contactName);
                    if(index!=-1) {
                        System.out.println(phnBook.get(index));
                    }
                    else{
                        System.out.println("Entry not found");
                    }
                    break;
                case 5:
                    for(Object entry:phnBook) {
                        System.out.println(entry);
                    }
                    break;
            }
        }while(choice!=6);
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Number: ");
        String num = sc.nextLine();
        phnBook.add(name+"\t"+num);
    }
    public static int search(String contact){
        int ind=0;
        for(Object element:phnBook){
            String entry = element.toString();
            String name = entry.split("\t")[0];
            if(contact.equalsIgnoreCase(name)){
                return ind;
            }
            ind++;
        }
        return -1;
    }

    public static int divide(int a, int b){
        int c = a/b;
        return c;
    }
    public static int sum(int[] arr) throws Exception{
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                sum+= arr[i];
            }
            else{
                throw new ArithmeticException("All the numbers should be positive");
            }
        }
        return sum;
    }


}
