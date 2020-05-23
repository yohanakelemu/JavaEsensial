import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        double res=0.0;
        if (b!=0)
            res=(double)a/(double)b;

       return res; // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}