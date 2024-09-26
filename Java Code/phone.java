public class phone {
    String getname(String a){
        return a;

    }
    int getphone(int b){
        return b;

    }
    public static void main(String args[]){
        phone obj = new phone();
        String name = obj.getname("Iam Manikandan");
        System.out.println(name);
        int phonee = obj.getphone(875484905);
        System.out.println(phonee);
    }
    
}
