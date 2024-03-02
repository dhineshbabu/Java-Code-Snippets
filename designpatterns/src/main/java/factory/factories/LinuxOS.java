package factory.factories;

public class LinuxOS extends OperatingSystem{

    public LinuxOS(String version, String architecture){
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("I am liunx");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("I am removing linux dir");
    }
}
