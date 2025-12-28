package corejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A {
    private void methodA() {
        System.out.println("private method accessed!");
    }
}

public class AccessPrivateMethodDemoApp {
    public static void main(String[] args) {
        try {
            Class classA = A.class;
            Constructor<A> constructor = classA.getDeclaredConstructor();
            Object o = constructor.newInstance();
            Method method = classA.getDeclaredMethod("methodA");
            method.setAccessible(true);
            method.invoke(o);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
