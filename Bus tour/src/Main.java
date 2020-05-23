import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int busSize=scanner.nextInt();
        int noB=scanner.nextInt();
        int heighB;
        boolean crash=false;
        int brn=0;
        for (int i=1;i<=noB;i++){
            heighB=scanner.nextInt();
            if (busSize>=heighB) {
                crash = true;
                brn=i;
                break;
            }
        }
        if (!crash)
            System.out.println("Will not crash");
        else
            System.out.println("Will crash  on bridge "+brn);
        // write your code here
    }
}
