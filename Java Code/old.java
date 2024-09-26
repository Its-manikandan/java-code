import java.lang.System;
import java.util.Scanner;
public class old {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        if (a.equals("green")){
            System.out.println("Stop");
        }
        else if (a.equals("red")){
            System.out.println("run");
        }
        else if (a.equals("blue")){
            System.out.println("go");
        }
    }
    
}
