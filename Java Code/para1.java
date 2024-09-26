public class para1 {
    void sum(int a, int b){
        System.out.println("Added Value:"+(a+b));
    }
    void sub(int a , int b){
        System.out.println("Subtracted Value:"+(a-b));
    }
    void mul(int a , int b){
        System.out.println("Multiplied Value:"+(a*b));
    }
    void div(int a , int b){
        System.out.println("Divided Value:"+(a/b));
    }

    public static void main(String args[]){
        para1 obj = new para1();
        obj.sum(10,19);
        obj.sub(10,1);
        obj.mul(10,11);
        obj.div(10,5);

    }
    
}
