import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        calci();//calling of function
    }
    public static void calci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number1: ");//get input from user for number1
        int a = sc.nextInt();
        System.out.print("Enter any number2: ");//get input from user for number2
        int b = sc.nextInt();
        int sum = a+b;//addition of 2 numbers
        System.out.println("Sum of the numbers: "+sum);
        if(a<b){//condition checks b is larger number or not
            int diff=b-a;
            System.out.println("Difference of the numbers: "+diff); //if yes it subtract a from b
        }
        else{
            int sub=a-b;
            System.out.println("Difference of the numbers: "+sub);//if not it subtract b from a
        }
    }
}
