import java.util.Scanner;
public class PositiveOrNegitive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = scan.nextInt();
        if(number > 0){ 
            System.out.println("The Number Entered is Positive ");
        }else{
            System.out.println("The Number Entered is Negitive ");

        }


    }
    
}
