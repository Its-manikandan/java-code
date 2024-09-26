public class para {
    void getsoap(int money){
        System.out.println(money);
        System.out.println("soap purchased");
    }
    void choclate(int money){
        System.out.println(money);
        System.out.println("Choclate purchased");
    }
    public static void main(String args[]){
        para obj1 = new para();
        obj1.getsoap(20);
        obj1.choclate(15);

    }
    
}
