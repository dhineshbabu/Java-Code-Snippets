package singleton;

import java.io.Serializable;

public class C02_EagerSingleton implements Serializable {
    // instance will be created when the class is loaded
    private static final C02_EagerSingleton instance = new C02_EagerSingleton();

    private C02_EagerSingleton() {

    }

    // simply return the instance
    public static C02_EagerSingleton getInstance(){
        return instance;
    }
}
