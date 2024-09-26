import java.util.Scanner;
public class color {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        
        if (a.equals("red")){
            System.out.println("Stop");
        }
        else if (a.equals("yellow")){
            System.out.println("Get Ready");
        }
        else if (a.equals("green")){
            System.out.println("go");
        }
        
    }
    
}
