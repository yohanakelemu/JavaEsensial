import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if (str.toUpperCase().startsWith("J"))
            System.out.println("true");
        else
            System.out.println("false");
        // put your code here
    }
}