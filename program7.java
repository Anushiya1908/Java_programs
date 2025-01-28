import java.util.Scanner;
public class program7 {
    public static void main (String[]args){
        leapyearmethod2();
    }
    //leap year or not
    public static void leap_year(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year= scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400==0)){ // to check the condition for leap year using logical operators
            System.out.println("The given year is a leap year "+year);
        }
        else{
            System.out.println("The given year is not a leap year "+year);
        }
    }

    public static void leapyearmethod2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if(year%4 == 0){    // the condition check whether the year is divisible by 4
            if(year% 100 == 0){  // if it is divisible by 4 it checks whether it is a century
                if(year % 400 == 0){  // if it is a century it checks whether it is divisible by 400
                    System.out.println("The given year is a leap year "+year);  //prints if all condition are satisfied
                }
                else{
                    System.out.println("The given year is not a leap year "+year); // if not divisible by 400
                }

            }
            else{
                System.out.println("The given year is a leap year "+year); // if not century but divisible by 4
            }
        }
        else{
            System.out.println("The given year is not a leap year "+year); //not divisible by 4
        }
    }
}
