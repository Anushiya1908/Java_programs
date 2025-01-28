import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        fibonnaci();
    }
    public static void fibonnaci(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of terms: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series");
        int a = 0;//initial value as zero
        int b=1;//next value as 1
        int count=0;//number of iteration from zero to n
        while(n>count){
            System.out.print(a+" ");  //print value of a
            int c=a+b; // value c add a and b
            a=b; // assign a is equal to b
            b=c; // assign b is equal to c(i.e)a+b
            count++; //increment
        }
    }
}
