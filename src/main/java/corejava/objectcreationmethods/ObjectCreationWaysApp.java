package corejava.objectcreationmethods;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Person implements Cloneable, Serializable {
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

class Student {
    private Student() {
    }
}

public class ObjectCreationWaysApp {

    public static void main(String[] args)
            throws CloneNotSupportedException,
            ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, IOException {

        // 1. using new operator
        Person newP = new Person();

        // 2. using clone method
        Person clonedP = newP.clone();

        // 3. using Reflection - Class.forName
        Person reflectionP = (Person) Class.forName("objectcreationmethods.Person").newInstance();

        // 4. using Reflection - private constructors
        Class reflectionS = Class.forName("objectcreationmethods.Student");
        Constructor[] constructors = reflectionS.getConstructors();
        for (Constructor c : constructors) {
            c.setAccessible(true);
            Student student = (Student) c.newInstance();
        }


        // 5. using Deserialization
        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person());
        oos.close();

        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person) ois.readObject();
        ois.close();

        // 6. by initializing arrays
        String[] names = {"nemo", "temo"};
    }

}
