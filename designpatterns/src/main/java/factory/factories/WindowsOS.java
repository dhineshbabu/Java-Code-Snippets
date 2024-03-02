package factory.factories;

public class WindowsOS extends OperatingSystem{

    public WindowsOS(String version, String architecture){
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("I am Windows");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("I am removing Windows dir");
    }
}
