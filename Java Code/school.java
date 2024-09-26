import java.util.Scanner;
public class school{
    String passorfail(int a){
        if (a>=35){
            return "pass";
        }
        else{
            return "Fail";
        }

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int total_mark = scan.nextInt();
        school obj = new school();
        String sub = obj.passorfail(total_mark);
        System.out.println(sub);
        }
}