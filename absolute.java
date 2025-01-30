//To get the absolute value of 2numbers
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        absvalue();//calling of function
    }
    public static void absvalue(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number1: ");//gets input for 1st number
        int a = sc.nextInt();
        System.out.print("Enter any number2: ");//gets input for 2nd number
        int b = sc.nextInt();
        int c=Math.abs(a+b);//the abs function adds and provide absolute value
        System.out.println("sum of the numbers: "+c);
        int d=Math.abs(a-b);//the abs function subtract and provide absolute value
        System.out.println("Difference in numbers: "+d);
    }
}
