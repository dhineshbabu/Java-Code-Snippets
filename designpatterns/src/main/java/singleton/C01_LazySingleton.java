package singleton;

import java.io.Serializable;

public class C01_LazySingleton implements Serializable {
    private static C01_LazySingleton instance = null;

    // create a private constructor for the class
    private C01_LazySingleton() {

    }

    // use the getmethod to get the existing object if is it already created
    // Note, this class is a static class
    // but multithreaded scenario is not handled - check the Eager Singleton class
    public static C01_LazySingleton getInstance() {
        if(instance == null) {
            instance = new C01_LazySingleton();
;        }
        return instance;
    }
}
