import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        num();
    }
    public static void num(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){//check the factors of the given number
            if(number%i==0){
                sum += i;//add all the factors
                System.out.print(sum+" ");
            }
            if(number==sum){//checks if the sum value is equal to the entered number
                System.out.println();
                System.out.println("Output:True");
                break;
            }
        }

    }
}
