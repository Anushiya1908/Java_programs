import java.util.Scanner;

public class program3 {
    public static void main(String[]args){
        relation();
    }
    //using else if and nested if
    public static void relation(){
        Scanner rela = new Scanner(System.in);
        System.out.println("To find relationship between 2 numbers");
        System.out.print("Enter the first number:");
        int a = rela.nextInt();//takes input from user for 1st number
        System.out.print("Enter the second number:");
        int b = rela.nextInt();//takes input from user for 2nd number
        if(a<b){  //to check whether a less than b
            System.out.println("a = "+a+" is lesser than b = "+b);
            if (a<=b) {  // to check a is less than or equal to b
                System.out.println("a = "+a+" is less than or equal to b = "+b);
            }
        }  else if (a>b) {  //to check whether a greater than b
            System.out.println("a ="+a+" is greater than b = "+b);
            if (a>=b) {    //to check whether a greater or equal to b
                System.out.println("a ="+a+" is greater than or equal to b = "+b);
            }
        }  else if (a==b) {  //to check a is equal to b
            System.out.println("a ="+a+" is equal to b = "+b);
        }
        else{  //else both are not equal to each other
            System.out.println("a = "+a+" is not equal to b = "+b);
        }
    }
}
