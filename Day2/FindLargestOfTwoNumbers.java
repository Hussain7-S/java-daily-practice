import java.util.Scanner;

public class FindLargestOfTwoNumbers {
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first Number : ");
    int num1 = scan.nextInt();
    System.out.println("Enter Second Number :  ");
    int num2 = scan.nextInt();
    if(num1 > num2 ){
        System.out.println(num1 + " Is Largest Number than " + num2); 
    }
    else{
        System.out.println(num2 + "  Is Larger than " + num1);
    }

}
}
