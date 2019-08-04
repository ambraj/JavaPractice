package corejava.java8examples;

interface Parser {
    String parse(String s);
}

public class MethodReferenceApp {
    public static void main(String[] args) {

        //        Parser p = new Parser() {
        //            @Override
        //            public String parse(String s) {
        //                return StringConverter.convert(s);
        //            }
        //        };

        Parser p = StringConverter::convert;
        System.out.println(p.parse("Ambuj"));
    }
}

class StringConverter {
    public static String convert(String s) {
        return s + " is a Boss";
    }
}