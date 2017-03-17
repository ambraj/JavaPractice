import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1st", "first");
        map.put("2nd", "second");
        map.put("3rd", "third");
        map.put("4th", "fourth");

        map.put("1st", "1st");
        System.out.println(map);

    }

}
