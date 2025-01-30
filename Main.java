import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        divisible();
    }
    public static void divisible(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= scanner.nextInt();
        if(a%27==0){
            System.out.println("The given number "+a+" is divisible by 27");//checks whether given number is divisible by 27
        }
        else{
            System.out.println("The given number "+a+" is not divisible by 27");
        }
    }
}