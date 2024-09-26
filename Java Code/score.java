import java.util.Scanner;
public class score {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score<50){
            System.out.print("You need to improve");
        }

        else if (score>=50 && score<=70){
            System.out.print("Good Job");
        }

        else if (score>70){
            System.out.print("Excellence performance");
        }
    }
    
}
