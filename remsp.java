import java.util.Scanner;

//to remove special character
public class remsp {
    public static void main(String[] args) {
        hello();//calling the function
    }

    public static void hello() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();//Take input as string with special characters
        System.out.println("Before removing special characters: "+a);
        String b=a.replaceAll("[^A-Z,a-z, ]","");//replace all value except a-z , space and A-Z
        System.out.println("After removing special characters: "+b);

    }
}
