import java.util.Scanner;
//un-optimised method
public class prime_checker {
    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To check whether the given number is prime or composite");
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        int count=0;
        if(a>1){
            for (int i=1;i<=a;i++){
                if(a%i==0){//check the factors of the number
                    count++;//count the number of factors
                }
            }
            if(count==2){//if the number has 2 factors then it is prime
                System.out.println("The given number is a prime number "+a);
            }
            else{
                System.out.println("The given number is not a prime number "+a);
            }
        }
        else{
            System.out.println("1 is neither prime nor composite");
        }
    }
}
