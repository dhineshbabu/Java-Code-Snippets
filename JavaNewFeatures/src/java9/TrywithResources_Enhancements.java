package java9;

import java.nio.channels.ScatteringByteChannel;

class MyResorce implements AutoCloseable {
    MyResorce() {
        System.out.println("Resource Creation");
    }

    public void doProcess() {
        System.out.println("Resource Processing...");
    }

    public void close() {
        System.out.println("Resource closing");
    }
}

public class TrywithResources_Enhancements {
    public static void main(String[] args) {
        MyResorce mr = new MyResorce();
        try (mr) {
            mr.doProcess();
        } catch (Exception e) {
            System.out.println("Hanndling Code " + e);
        }
    }
}
