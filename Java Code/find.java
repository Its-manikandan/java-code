import java.util.Scanner;
public class find{
    void evenorodd(int number){
        if (number%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        find obj = new find();
        obj.evenorodd(number);


    }
}