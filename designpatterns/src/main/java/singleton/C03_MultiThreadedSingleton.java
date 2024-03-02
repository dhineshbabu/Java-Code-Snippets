package singleton;

public class C03_MultiThreadedSingleton {
    private static C03_MultiThreadedSingleton instance = null;

    private C03_MultiThreadedSingleton() {

    }

    // create a synchronized block for creating instance
    private static C03_MultiThreadedSingleton getInstance(){
        if(instance == null) {
            // have the class level lock, because the method is static
            synchronized (C03_MultiThreadedSingleton.class){
                if(instance == null) {
                    instance = new C03_MultiThreadedSingleton();
                }
            }
        }
        return instance;
    }
}
