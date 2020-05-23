import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int num;
        int max=0;
        for (int i=1;i<=n;i++){
           num=scanner.nextInt();
           if (num%4==0 && i==0){
               max=num;
           }else{
               if(num%4==0){
                   if (num>max){
                       max=num;
                   }

               }
           }

        }
        System.out.println(max);
        // put your code here
    }
}