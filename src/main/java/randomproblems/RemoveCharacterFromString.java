package randomproblems;

/**
 * Removes any given character from a String.<br>
 * This program uses the StringBuilder to avoid un-necessary creation of
 * immutable String object.
 *
 * @author rampravesh, May 28, 2012
 */

public class RemoveCharacterFromString {

    public static void main(String[] args) {
        System.out.println(removeCharInString("My name is rampravesh kumara", 'a'));
    }

    public static String removeCharInString(String str, char charToBeRemoved) {

        if (str == null)
            return "";

        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == charToBeRemoved)
                continue;
            strBuild.append(ch);
        }
        return strBuild.toString();
    }
}