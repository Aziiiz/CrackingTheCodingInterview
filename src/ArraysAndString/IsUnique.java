package ArraysAndString;

public class IsUnique {

    private static boolean isUnique(String s) {
        if(s.length() > 128) return false;

        boolean[] chars = new boolean[128];
        for(int i=0; i<s.length(); i++) {
            if(chars[s.charAt(i)]) return false;
            else chars[s.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String[] args) {
       String[] testWords = {"leetcode", "abcde", "aabbccddee", "!@#$adfc"};

       for(String w: testWords) System.out.println(isUnique(w));
    }
}
