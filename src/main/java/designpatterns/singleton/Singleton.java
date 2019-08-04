package designpatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    private static Object mutex = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null) {
                    result = instance = new Singleton();
                }
            }
        }
        return result;
    }

    protected Object readResolve() {
        return instance;
    }

}
