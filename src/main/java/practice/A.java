package practice;

import java.util.Arrays;
import java.util.Comparator;

public class A {

    public String name;

    A(String name){

    }

    static void fun1(){

    }

    public static void main(String[] args) {
        String[] names = {"Mary","Jane","Elizabeth","Jo"};
        Arrays.sort(names, new Compare());
        loop1 :
        for (String name: names) {
            System.out.println(name);
            break loop1;
        }
    }

}

class B extends A{

    private String name;

    B(String name){
        super(name);
    }

    B(String anem, String name){
        super(name);

    }

    public String getName() {
        return this.name + super.name;
    }

    static void fun1(){

    }
}

class Compare implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}
