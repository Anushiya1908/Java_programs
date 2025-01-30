import java.util.Scanner;
import java.util.*;
public class prime {
    public static void main(String[] args) {
          prime();
    }

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number:");//enter the starting value
        int n=sc.nextInt();
        System.out.print("Enter ending number:");//enter the ending value
        int m=sc.nextInt();
        ArrayList<Integer> primes= new ArrayList<>();

            for(int i=n;i<=m;i++){
                if (isprime(i)) {//checks whether the value is prime or not
                    primes.add(i);//if it is prime add it to array
                }
            }
            if(primes.size()>0){
                System.out.println("The prime numbers between "+n+" and "+m+" are:"+primes);
            }
            else{
                System.out.println("The prime numbers between "+n+" and "+m+" are none");
            }

    }



    public static boolean isprime(int num){//function to check prime or not
        if(num<=1){//1 is neither prime nor composite
            return false;
        }
        for(int i=2;i*i<=num;i++){//prime factors are always less than the squareroot value
            if(num%i ==0){//checks whether divisible or not
                return false;
            }
        }
        return true;
    }

}
