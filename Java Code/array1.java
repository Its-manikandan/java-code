import java.util.Scanner;
public class array1 {
    public static void main (String args[]){
        int [] number = new int[5];
        Scanner scan = new Scanner (System.in);
        number[0] = scan.nextInt();
        number[1] = scan.nextInt();
        number[2] = scan.nextInt();
        number[3] = scan.nextInt();
        number[4] = scan.nextInt();

        System.out.println("Sum of the Numbers:"+ (number[0]+number[1]+number[2]+number[3]+number[4]));





    }
    
}
