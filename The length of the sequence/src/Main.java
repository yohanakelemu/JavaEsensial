import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        int count=0;
        while (scanner.hasNext()){
            num=scanner.nextInt();
            if (num==0)
                break;
            count++;

        }
        System.out.println(count);
        // put your code here
    }
}