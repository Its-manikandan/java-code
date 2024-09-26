public class overload {
    void sum(int a , int b){
        System.out.println(a+b);
    
    }
    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }
    public static void main(String args[]){
        overload obj = new overload();
        obj.sum(10,10,99);
        obj.sum(22,44);
    }
    
}
