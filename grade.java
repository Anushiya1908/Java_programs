import java.util.Scanner;

public class grade {
    public static void main(String[]args){
        grade();
    }
    public static void grade(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks you scored: ");
        int mark = sc.nextInt();
        System.out.println("mark should be between 0 and 100");
        if((mark >0)&&(mark <=100) ){
            if(mark>=90){
                System.out.println("Grade A");
            } else if ((mark>=80)&&(mark<90)) {
                System.out.println("Grade B");
            }
            else if ((mark>=70)&&(mark<80)) {
                System.out.println("Grade C");
            }
            else if ((mark>=60)&&(mark<70)) {
                System.out.println("Grade D");
            }
            else{
                System.out.println("grade F");
            }
        }
        else{
            System.out.println("Invalid mark");
        }
    }
}
