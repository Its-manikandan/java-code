import java.util.Scanner;

public class marks {
    public static void main(String args[])
    {
        Scanner vada = new Scanner(System.in);
        String name=vada.nextLine();
        double mark=vada.nextInt();
        vada.nextLine();
        String department=vada.nextLine();

        System.out.println("My name is "+ name);
        System.out.println("My mark is "+ mark/10 +"/10");
        System.out.println("My Department is "+ department);




    }
    
}
