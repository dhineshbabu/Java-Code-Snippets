package general_programming;

class Main {

    private static Main obj;

    private Main() {
        System.out.println("Inside private constructor");
    }

    public static Main getInstance() {
        if(obj == null){
            obj = new Main();
        }

        return obj;
    }

    public void display() {
        System.out.println("Singleton pattern is achieved!!!");
    }
}

public class SingletonUsingPrivateConstructor {
    public static void main(String[] args) {
        Main mainObj = Main.getInstance();
        mainObj.display();
    }
}