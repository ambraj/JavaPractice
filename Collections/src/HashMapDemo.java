import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1st", "first");
        map.put("2nd", "second");
        map.put("3rd", "third");
        map.put("4th", "fourth");

        map.put("1st", "1st");

        // using looping entry set
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getValue());
        }

        //loop a Map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }


        // using looping key set
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }

}
