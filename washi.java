import java.util.Scanner;
public class washi {
    public static void main(String[]args){
        Washi();
    }
    public static void Washi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Washing machine working");//to show working of washing machine
        System.out.print("Enter weight of cloths: ");
        int weight=sc.nextInt();
        if (weight < 0) {
            System.out.println("Invalid input");//if any negative value then it shows invalid
        } else if (weight == 0) {
            System.out.println("Time Estimated : 0 mins");//if no weight no time shows not started
        } else if (weight <= 2000) {
            System.out.println("Time Estimated: 25 mins");//low level less than 2000 grams time takes is 25mins
        } else if (weight > 2000 && weight <= 4000) {
            System.out.println("Time Estimated: 35 mins");//medium level less than 4000 grams time takes is 35mins
        } else if (weight > 4000 && weight <= 7000) {
            System.out.println("Time Estimated: 45 mins");//high level less than 7000 grams time takes is 45mins
        } else {
            System.out.println("OVERLOADED");//above high level is overload
        }
    }
}
