package Practice.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Deepakaaaaaaaaa";
        printDuplicatesFromString(str);
    }

    public static String printDuplicatesFromString(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character chr = str.charAt(i);
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) + 1);
            } else {
                map.put(chr, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return null;
    }
}
