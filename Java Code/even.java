import java.util.Scanner;
public class even {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num%2==0) {
            System.out.print("Even Number");
        
        }
        else{
            System.out.print("Odd Number");
        }
    }
    
}
