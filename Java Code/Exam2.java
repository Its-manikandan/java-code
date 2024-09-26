import java.util.Scanner;
public class Exam2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Salary:");
        int salary = scan.nextInt();
        System.out.println("Enter the age:");

        int age = scan.nextInt();

        if((salary>=20000) || (age<=25)){
            System.out.println("You are Eligible for the Loan");
            
            else {
            System.out.println("You are not Eligible for the loan");
            } 
            System.out.println("Enter the loan amount:");   

            int loan = scan.nextInt();

            if (loan<=50000){
                System.out.println("You are Eligible for the Loan");
            }
            else if (loan>50000){
                System.out.println("Maximum amount is 50000");
            }

        }   
        
        

    }
}
