import java.util.*;
public class nonempty {
    public static void main(String[] args) {
        nonempty();
    }
    public static void nonempty(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array: ");
        int n= sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();//creating an array
        int result=0;
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<=n-1;i++){//adding elements in array
            int num=sc.nextInt();
            arr1.add(num);
        }
        System.out.println("Elements in the array: ");//display elements in array
        for(int num:arr1){
            System.out.print(num+" ");
        }
        for(int num:arr1){
            result ^= num;//do ex-or operation for each element to find non repeated value
        }
        System.out.println();
        System.out.println("The non repeating number in the list is: "+result);
    }
}
