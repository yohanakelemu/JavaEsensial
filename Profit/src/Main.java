import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double M=scanner.nextDouble();
        double P=scanner.nextDouble();
        double K=scanner.nextDouble();
        int y=0;
       while (K>M){
           M=M+M*(P/100);
           y++;
       }
        System.out.println(y);
        // write your code here
    }
}