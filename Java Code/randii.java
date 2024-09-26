import java.util.Random;
public class randii{
    public static void main(String args[]){
        Random rand = new Random();
        int New = 0;

        while(New!=5){
            New=rand.nextInt(11);
            System.out.println(New);
        }
        
    }

}