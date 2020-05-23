import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        if (K<M*N && (K%N==0 || K%M==0))
            System.out.println("YES");
        else
            System.out.println("NO");
        // put your code here
    }
}