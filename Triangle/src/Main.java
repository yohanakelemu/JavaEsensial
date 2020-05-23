import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sideOne=scanner.nextInt();
        int sideTwo=scanner.nextInt();
        int sideThree=scanner.nextInt();
        if (sideOne+sideTwo>sideThree && sideOne+sideThree>sideTwo && sideTwo+sideThree>sideOne )
            System.out.println("YES");
        else
            System.out.println("NO");
        // put your code here
    }
}