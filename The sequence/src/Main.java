import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=0;
        int n=scanner.nextInt();
        int i=1;
        int num;
        while (i<=n){
            num=scanner.nextInt();
            if (num%4==0 && i==1){
                max=num;
            }else {
                if (num%4==0){
                    if (num>max){
                        max=num;
                    }
                }
            }
            i++;
        }
        System.out.println(max);
        // put your code here
    }
}