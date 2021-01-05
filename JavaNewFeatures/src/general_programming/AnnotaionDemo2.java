package general_programming;
//Creating custom annotations

import java.lang.annotation.*;

// Marker Annotation
@interface Smartphone {

}

//Single value annotation
@Inherited //Meta annotation
@Documented //Meta annotation
@Target(ElementType.TYPE) //Meta annotation
@Retention(RetentionPolicy.RUNTIME) //Meta annotation
@interface Smartphone1 {
    String OS() default "Symbian";
}

//Multivalue annotation
@Target(ElementType.TYPE) //Meta annotation
@Retention(RetentionPolicy.RUNTIME) //Meta annotation
@interface Smartphone2 {
    String OS() default "Android";
    int version() default 1;
}

@Smartphone1(OS="Android")
class NokiaSeries {

    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

@Smartphone2(OS="AndroidNew", version = 2)
class OneplusSeries {

    String model;
    int size;

    public OneplusSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }

}

public class AnnotaionDemo2 {

    public static void main(String[] args) {
        NokiaSeries nk = new NokiaSeries("Fire", 5);
        //using reflection API to get the annotation details
        Class c = nk.getClass();
        Annotation an = c.getAnnotation(Smartphone1.class);
        Smartphone1 s = (Smartphone1) an;
        System.out.println("Noika Series Details");
        System.out.println(s.OS());

        OneplusSeries os = new OneplusSeries("Oneplus 5T", 5);
        Class c1 = os.getClass();
        Annotation an1 = c1.getAnnotation(Smartphone2.class);
        Smartphone2 s2 = (Smartphone2) an1;
        System.out.println("Oneplus Series Details");
        System.out.println(s2.OS());
        System.out.println(s2.version());
    }
}
