import java.util.Scanner;

public class program2 {
    public static void main(String[]args){
        bool_relation();
    }
    //to find boolean value for all relational operator for 2 numbers
    //to showcase the properties of relational operator
    public static void bool_relation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To find relationship between 2 numbers whether true or false");
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.print("a is less than or equal to b ");
        System.out.println(a<=b);
        System.out.print("a is less than b ");
        System.out.println(a<b);
        System.out.print("a is greater than or equal to b ");
        System.out.println(a>=b);
        System.out.print("a is greater than b ");
        System.out.println(a>b);
        System.out.print("a is equal to b ");
        System.out.println(a==b);
        System.out.print("a is not equal to b ");
        System.out.println(a!=b);
    }
}
