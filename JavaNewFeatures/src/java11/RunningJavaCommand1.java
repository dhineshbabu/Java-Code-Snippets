package java11;

//testing multiple main methods

class A {
    public static void main(String[] args) {
        //java RunningJavaCommand1.java -> this command will check for the very first main method in file and will run that class's main method
        System.out.println("From class A main method");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("From class B main method");
    }
}

public class RunningJavaCommand1 {
    public static void main(String[] args) {
        System.out.println("From another class main method");
    }
}
