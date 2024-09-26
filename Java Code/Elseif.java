import java.util.Scanner;
public class Elseif {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mark=scan.nextInt();

        if (mark>35 && mark<50){
            System.out.print("Movie");
        }
        else if (mark>50 && mark<75){
            System.out.print("Iphone");
        }
        else{
            System.out.print("Dubai");
        }
    }
    
}
