import java.util.Locale;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();

        if(palindrome(a)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
    public static boolean palindrome(String a){

        String cleaned=a.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);
        StringBuilder reversed=new StringBuilder(cleaned);
        System.out.println(reversed.reverse());
        return cleaned.equals(reversed.toString());

    }
}
