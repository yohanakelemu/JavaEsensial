import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n==1){
            System.out.println(n);
        }else {
            do {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
            } while (n != 1);
            System.out.println(n);
        }
       // put your code here
    }
}