import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = scan.nextInt();
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Greater Number");
        } else if(num2 > num3) {
            System.out.println(num2 +" is Greater Number");
        } else {
            System.out.println(num3 +" is Greater Number");
        }
    }
    
}
