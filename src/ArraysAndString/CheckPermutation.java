package ArraysAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    private static boolean isPermutation(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else map.put(s.charAt(i), 1);
        }
        for(int i=0; i<t.length(); i++) {
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0) map.put(t.charAt(i), map.get(t.charAt(i))-1);
            else return false;
        }
        return true;
    }

    private static boolean isPermutation2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return new String(sChars).equals(new String(tChars));

    }

    public static void main(String[] args) {

        String[][] str = {{"abc", "ccb"}, {"hello", "ollleh"}, {"permutation", "premutation"}, {"apple", "papel"}};
        for(String[] pair: str) {
            System.out.println(isPermutation(pair[0], pair[1]));
            System.out.println(isPermutation2(pair[0], pair[1]));
        }
    }
}
