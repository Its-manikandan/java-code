import java.lang.System;
import java.util.Scanner;
public class sub{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int ESIOT = scan.nextInt();
        int BA = scan.nextInt();
        int EAI = scan.nextInt();
        int ESIA = scan.nextInt();
        int NS = scan.nextInt();

        int Total = (ESIOT + BA + EAI + ESIA + NS );
        System.out.println(Total);
        int Average = (Total/5);
        System.out.println(Average);

        if (Average<35){
            System.out.println("You need an Additional Class");
        }
        else{
            System.out.println("You are good to go");
        }
    }
}