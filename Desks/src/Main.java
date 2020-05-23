import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupone=scanner.nextInt();
        int grouptwo=scanner.nextInt();
        int groupthree=scanner.nextInt();
        int godesk;
        int gtdesk;
        int gthdesk;
        if(groupone%2==0){
             godesk=groupone/2;
        }else{
         godesk=(groupone/2)+1;
        }
        if(grouptwo%2==0){
             gtdesk=grouptwo/2;
        }else{
         gtdesk=(grouptwo/2)+1;
        }
        if(groupthree%2==0){
             gthdesk=groupthree/2;
        }else{
         gthdesk=(groupthree/2)+1;
        }
        System.out.println(godesk+gtdesk+gthdesk);
        // put your code here
    }
}
