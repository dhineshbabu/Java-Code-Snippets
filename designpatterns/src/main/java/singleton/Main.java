package singleton;

import javax.management.InstanceAlreadyExistsException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstanceAlreadyExistsException, IllegalAccessException, InstantiationException {
//        exampleSerialization();
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        C01_LazySingleton lazySingleton = C01_LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        C01_LazySingleton deserializedLazy = (C01_LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazySingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());
        /*
        Object 1 :1104106489
        Object 2 :1717159510
         */

        // below demo is using the SerializableSingleton with readResolve() method implemented
        C04_SerializableSingleton serializableSingleton = C04_SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        C04_SerializableSingleton deserializedInstance = (C04_SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton Object 2 :" + deserializedInstance.hashCode());

        /*
        Note: Both the objects are the same
        SerializableSingleton Object 1 :2052001577
        SerializableSingleton Object 2 :2052001577
         */
    }

    // In this reflection method we can break the singleton pattern

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException{
        Constructor[] constructors = C01_LazySingleton.class.getDeclaredConstructors();
        // this will have only 1 constructor
        Constructor constructor = constructors[0];
        // changing the visibility to the constructor programmatically
        constructor.setAccessible(true);
        C01_LazySingleton lazySingleton = C01_LazySingleton.getInstance();
        // Createing the instance via reflection - it should break the singleton
        C01_LazySingleton instance = (C01_LazySingleton) constructor.newInstance();
        System.out.println("Reflected hashcode singleton :"+lazySingleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());
        /*
        Reflected hashcode singleton :918221580
        Singleton instance : 681842940
         */

        // Solution to this is go by enum
        C05_EnumSingleton.INSTANCE.doSomething();
    }


}
