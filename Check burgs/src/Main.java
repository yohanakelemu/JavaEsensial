import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameCity=scanner.nextLine();
        if (nameCity.endsWith("burg"))
            System.out.println("true");
        else
            System.out.println("false");
        // put your code here
    }
}