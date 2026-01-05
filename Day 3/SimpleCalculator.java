import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number :  ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter the Operator ('+','-','*','/') : ");
        char operator = scan.next().charAt(0);
    
        switch(operator)
        {
            case '+':
                System.out.println("Addition of "  + (num1 + num2));
                break;
                case '-':
                    System.out.println("Substraction : " + (num1 - num2));
                    break;
                    case '*':
                        System.out.println("Multiplication : " + (num1 + num2));
                        break;
                        case '/':
                            System.out.println("Division : " + (num1 + num2));
                            break;
                            default:
                                System.out.println("INVALID OPERATOR");
                                break;
        }
    }
    
}
