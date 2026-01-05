import java.util.Scanner;

public class MenuUsingSwitch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 3 : ");
        int number = scan.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("You Selected Java");
                break;
                case 2:
                    System.out.println("You Selected Python");
                    break;
                    case 3:
                        System.out.println("You Selected C++");
                        break;
                        default:
                            System.out.println("Invalid Selection");
        }
    }
    
}
