import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static int[] seq=new int[100];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ass,des;
        boolean isAss=true;
        boolean isDess=true;
        int num;
        int ind=0;
        while (scanner.hasNext()){
          num=scanner.nextInt();
          if (num==0)
              break;
          seq[ind]=num;
          ind++;

        }

        for (int i = 1; i < ind; i++) {
            if (seq[i] >seq[i-1])
                 isAss=false;
            if (seq[i] < seq[i-1])
                isDess = false;
        }
        if (isAss || isDess) {
            System.out.println("true");
        }else
            System.out.println("false");

        // put your code hereisAss
    }
}