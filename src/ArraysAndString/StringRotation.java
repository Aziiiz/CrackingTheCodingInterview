package ArraysAndString;

public class StringRotation {


    private static boolean isSubstring(String s, String s2) {
        return s.contains(s2);
    }

    private static boolean rotateString(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        String ss1 = s1 + s1;
        return isSubstring(ss1, s2);
    }



    public static void main(String[] args) {
        String[][] str = {{"waterbottle", "erbottlewat"}, {"apple", "pleap"}};

        for(String[] s : str) {
            System.out.println(rotateString(s[0], s[1]));
        }
    }
}
