import java.util.Scanner;
public class program6 {
    public static void main(String[]args){
       boolean isarmstrong = armstrong();
       if(isarmstrong){
           System.out.println("given number is armstrong");
       }
       else{
           System.out.println("It is not an armstrong number");
       }
    }

    public static boolean armstrong(){
        System.out.println("To find the given number is armstrong or not");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int temp = a;//temporary variable for copying the value
        String b= Integer.toString(a);//convert integer to string
        int c;
        c = b.length();//to find the length of digit
        int sum=0;
        while(temp>0){
            int digit= temp % 10;//retrieve last digit
            sum += Math.pow(digit,c);//multiply every digit with the power of length and add them
            temp/=10;//quotient
        }
        System.out.print("Armstrong value: ");
        System.out.println(sum);
        return sum == a;
    }
}
