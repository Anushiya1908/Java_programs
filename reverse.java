//reverse a string using stringbuilder method
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any sentence :");
        String var = sc.nextLine();
        System.out.println("Before reversing: "+var);
        StringBuilder rev=new StringBuilder("" + var);
        System.out.println("After reversing: "+rev.reverse());

    }
}
