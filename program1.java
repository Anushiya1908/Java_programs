import java.util.Scanner;

public class program1 {
    public static void main(String[]args){
        vowels_or_not();
    }

    //To find char vowels and consonents
    public static void vowels_or_not(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check whether it is vowel or consonent: ");
        char ch;
        ch = sc.next().charAt(0);//Take character as input

        //using branching statement
        //check condition whether it is a vowel or not
        //vowels are a e i o u
        if(ch=='a' ){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='e'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='i'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='o'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='u'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='A'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='E'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='I'){
            System.out.println("The given character is a vowel");
        }else if(ch=='O'){
            System.out.println("The given character is a vowel");
        }
        else if(ch=='U'){
            System.out.println("The given character is a vowel");
        }
        else{
            System.out.println("Not a vowel");
        }
    }
}
