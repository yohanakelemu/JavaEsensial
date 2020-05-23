import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long firstNumber=scanner.nextLong();
        char op=scanner.next().charAt(0);
        long secondNumber=scanner.nextLong();
        long result=0;
        switch (op){
            case '+':
                result=firstNumber+secondNumber;
                System.out.println(result);
                break;
            case '-':
                result=firstNumber-secondNumber;
                System.out.println(result);
                break;
            case '*':
                result=firstNumber*secondNumber;
                System.out.println(result);
                break;
                case '/':
                    if (secondNumber==0)
                        System.out.println("Division by 0!");
                    else {
                        result=firstNumber/secondNumber;
                        System.out.println(result);
                    }
                    break;
            default:
                System.out.println("Unknown operator");
        }
    }
}