package factory;

import factory.factories.LinuxOS;
import factory.factories.OperatingSystem;
import factory.factories.WindowsOS;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {

    }
        /*
        // One more advantage , tomorrow you planned to change OS here , you can simply change this and everything works as is.

        Example creation of object.
        OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("WINDOWS" , "WIN7" ,"x64");
        OperatingSystem operatingSystem2 = OperatingSystemFactory.getInstance("LINUX" , "DEB" ,"x64");
         */

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOS(version, architecture);
            case "LINUX":
                return new LinuxOS(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not Supported");
        }
    }
}
