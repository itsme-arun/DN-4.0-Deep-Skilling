public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        obj1.message();

        if(obj1 == obj2){
            System.out.println("Both are Same Object");
        }else{
            System.out.println("Not Same");
        }
    }
}