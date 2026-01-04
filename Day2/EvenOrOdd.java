import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = scan.nextInt();
        if(a % 2 == 0) { 
            System.out.println("The Given Number is Even");
        }else{ 
            System.out.println("The Given Number is Odd");
        }
    }
}