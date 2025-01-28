import java.util.Scanner;

public class program4 {
    public static void main(String[]args){
        largest_between_3num();
    }

    public static void large() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st mysterious number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd mysterious number:");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a = "+a+" is larger than b = "+b);
        } else if (b>a) {
            System.out.println("b = "+b+" is larger than a = "+a);
        }
        else {
            System.out.println(a+"a is equal to b"+b);
        }
    }

    public static void largest_between_3num(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 1ST NUMBER: ");
        int a = sc.nextInt();
        System.out.print("ENTER 2ND NUMBER: ");
        int b = sc.nextInt();
        System.out.print("ENTER 3RD NUMBER: ");
        int c = sc.nextInt();
        System.out.println("value of a= "+a+" b= "+b+" c= "+c);
        if(a<b){
            if(b<c){
                System.out.println("c is greater than a and b");
            }
            else{
                if(c<b){
                    System.out.println("b is greater than a and b");
                }
            }
        }
        else{
            if(a>c){
                System.out.println("a is greater than b and c");
            }
        }

    }
}
