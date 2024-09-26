public class returnn {
    int sum(int a, int b){
        int c = a+b;
        return c;


    }
    public static void main(String args[]){
        returnn obj = new returnn();
        int sub = obj.sum(10,20);
        System.out.println(sub);
    }
    
}
