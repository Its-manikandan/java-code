public class loop1{
    public static void main(String args[]){
        int count = 0;
        for (int i = 1 ; i<=10 ; i=i+1){
            if (i%2==0){
                count = count + 1;
            }
        }
        System.out.println("COUNT of the NUMBERS:"+count);

    }
}