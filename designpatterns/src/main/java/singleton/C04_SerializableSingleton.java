package singleton;

import java.io.Serial;
import java.io.Serializable;

public class C04_SerializableSingleton implements Serializable {
    private static  C04_SerializableSingleton instance = null;
    private C04_SerializableSingleton() {

    }

    public static C04_SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new C04_SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method which is responsible during deserialization process
     * This method get invoked, and we are simply returning already created object
     * @return
     */

    @Serial
    public Object readResolve() {
        return instance;
    }
}
