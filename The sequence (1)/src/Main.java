import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=1;i<100;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
                count++;
                if (count==n)
                    System.exit(0);
            }
        }
        // put your code here
    }
}