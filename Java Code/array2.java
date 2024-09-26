import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] number = new int [size];
        for (int i=0; i<=size-1; i=i+1){
            number[i]=scan.nextInt();
        }
        System.out.println(number[size/2]);
        

    }
    
}
