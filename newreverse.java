import java.util.Scanner;

//To reverse a string without
public class newreverse {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String a=sc.nextLine();
        String reversestr ="";
        System.out.println("Before reversing: "+a);
        for(int i=a.length()-1;i>=0;i--){
            reversestr += a.charAt(i);
        }
        System.out.println("Reversed string: "+reversestr);
    }
}
