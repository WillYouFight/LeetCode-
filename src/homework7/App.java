package homework7;

/**
 * project : Bootcamp1
 * package : homework7
 * author  : Allamuradov Tal'at
 * date    : 05.09.2022_12:01
 */
public class App {
    private String appName;  // bita dastur nomi
    private int appSize; // bita dastru hajmi

    public App(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }

}
