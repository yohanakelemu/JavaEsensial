import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        boolean isBtween=(num2<=num1&& num1<=num3 )|| (num3<=num1&&num1<=num2);
        System.out.println(isBtween);
        // put your code here
    }
}