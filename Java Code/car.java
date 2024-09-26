import java.util.Scanner;
public class car{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = scan.nextInt();
        System.out.println("Number 2:");

        int b = scan.nextInt();
        for (int i=a ; i<=b ; i=i+1){
            System.out.println(i);
        }
    }
}