import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=0;
        int count=0;
        float avarage=0f;
        for (int i=a;i<=b;i++){
            if (i%3==0){
                sum+=i;
                count++;
            }
        }
        avarage=(float)sum/(float)count;
        System.out.println(avarage);
        // put your code here
    }
}