import java.util.Scanner;

public class welcome {
    public static void main(String[]args){
        welcome();
    }
    public static void welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        if(a%3==0 && a%4==0){
            System.out.println("good morning");
        } else if (a%3==0 && a%4!=0) {
            System.out.println("good afternoon");
        } else if (a%3!=0 && a%4==0) {
            System.out.println("good evening");
        }
        else{
            System.out.println("good night");
        }

    }
}
