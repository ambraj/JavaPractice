/*Name Of Program: Find the frequency of words in File.*/


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * This program reads the text file and determine the frequency of each word in
 * sorted order on the basis of frequency.<br>
 * The basic goal to write this program is see the uses of Comparator,
 * LinkedHashMap,Map.Entry, FileReader, StringBuilder and etc
 * 
 * @author rampravesh, May 28, 2012
 */

public class FileIO {

    public static void main (String[] args) throws IOException {
        
        readTextFileInBinaryMode ("T.txt");

    }

    public static void readTextFileInBinaryMode (String fileName) {

        FileReader fileReader = null;

        LinkedHashMap <String, Integer> wordcount =
                new LinkedHashMap <String, Integer> ();

        try {
            /*
             * Reading the test file and splits into words and puts the word in
             * LinkeHashMap as Key and value part is frequency of word in file.
             */
            File file = new File (fileName);

            fileReader = new FileReader (file);

            int ch = -1;
            boolean prevCharIsNotSpace = true;
            StringBuilder strBuild = new StringBuilder ();

            while ((ch = fileReader.read ()) != -1) {

                if (ch == 32) {

                    if (prevCharIsNotSpace) {
                        // System.out.println (strBuild);
                        Integer freq = wordcount.get (strBuild.toString ());
                        // Put the key(word) with it's frequency.
                        wordcount.put (strBuild.toString (), (freq == null ? 1
                                : freq + 1));
                    }

                    prevCharIsNotSpace = false;
                    continue;
                }

                if (prevCharIsNotSpace == false)
                    strBuild = new StringBuilder ();

                strBuild.append ((char) ch);
                prevCharIsNotSpace = true;
            }
        }
        catch (Exception e) {
            // TODO: handle exception
        }

        /*
         * Sorting the map on the basis for value part and print it.
         */
        List <Map.Entry <String, Integer>> list =
                new ArrayList <Map.Entry <String, Integer>> ();

        for (Map.Entry <String, Integer> entry : wordcount.entrySet ()) {
            // System.out.println (entry.getKey () + "  " + entry.getValue ());
            list.add (entry);
        }

        Collections.sort (list, new MapComprator ());

        for (Map.Entry <String, Integer> entry : list) {
            System.out.println (entry.getKey () + "  " + entry.getValue ());
        }
        /*********************************************************************/

    }
}

class MapComprator implements Comparator <Map.Entry <String, Integer>> {

    public int compare (Entry <String, Integer> o1, Entry <String, Integer> o2) {
        return (o2.getValue ().compareTo (o1.getValue ()));

    }
}