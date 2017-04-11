package singletonPatern;

/**
 * Created by bilalsay on 20/03/2017.
 */
public class Singleton {

    private static Singleton singletonInstance;
    private Singleton(){}

    public static Singleton getInstance() {
        if (singletonInstance == null)
            singletonInstance = new Singleton();
        return singletonInstance;
    }
}
