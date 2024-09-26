import java.util.Scanner;
public class vada {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();

        if (income>7000){
            System.out.print("Scholarship is available");
        }
        else{
            System.out.print("Scholarship is not available");
        }
    }
    
}
