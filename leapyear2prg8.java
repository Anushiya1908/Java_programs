import java.util.Scanner;

public class leapyear2prg8 {
    public static void main(String[]args){

    }
    public static void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year= scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400==0)){
            // to check the condition for leap year using logical operators
            //checks whether the year is not a century and divisible by 4 or divisible by 400
            //print as leap year if all condition satisfies
            System.out.println("The given year is a leap year "+year);
        }
        else{
            System.out.println("The given year is not a leap year "+year);
        }
    }
}
