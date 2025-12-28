package practice;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) throws IOException {


        LocalDate localDate = LocalDate.of(2015, 4, 4);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));

        SortedSet<Element> s = new TreeSet<>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));

        System.out.println(s.first() + " " + s.size());


    }

}

class Element implements Comparable {
    int id;

    Element(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Element e = (Element) o;

        return this.id - e.id;
    }

    @Override
    public String toString() {
        return "" + this.id;
    }
}
