import java.util.Scanner;
public class num {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String result = a>b?"yes":"No";
        System.out.print(result);
    }
    
}
