import java.util.Scanner;

public class number {
    public static void main(String[]args){
        number();
    }
    public static void number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        if (a>=50){
            System.out.println("The number is above 50 or equal to 50 ");

        }
        else if(a<50 && a>=40){
            System.out.println("The number is between 50 and 40 or equal to 40");

        }
        else{
            System.out.println("The number is less than 40");
        }
    }
}

