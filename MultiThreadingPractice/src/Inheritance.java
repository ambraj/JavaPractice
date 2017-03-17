import java.io.IOException;

class A {
    public void test() throws Exception {
        System.out.println("A : test");
    }
}

class B extends A {
    public void test() throws IOException {
        System.out.println("B : test");
    }
}

class C extends B {
    public void test() {
        System.out.println("C : test");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
