import java.util.Scanner;
public class program5 {
    public static void main(String[]args){
        sumofdigit();
    }

    //sum of digits
    public static void sumofdigit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp= n;//temporary variable to store the value
        int sum=0;
        while(temp>0){
            int digit= temp % 10;//to get remainder  let us take n=123 remainder=3
            sum += digit;//add remainder to variable sum  0+3
            temp/=10;//takes quoitent  12
        }
        System.out.println("sum of digits of the number: "+sum);
    }
}
