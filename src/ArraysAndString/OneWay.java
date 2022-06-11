package ArraysAndString;

public class OneWay {

    private static boolean oneWay(String s, String t) {
        int[] letter1 = new int[26];
        int[] letter2 = new int[26];

        for(char c: s.toCharArray()) letter1[c-'a']++;

        for(char c: t.toCharArray()) letter2[c-'a']++;

        int max = 0;

        for(int i=0; i<26; i++) {
            if(max > 2) return false;

            if(letter1[i] != letter2[i]) max++;
        }
        return true;
    }



    private static boolean oneWayEdit(String s, String t) {
        if(s.length() == t.length()) return oneWayReplace(s, t);
        else if(s.length()+1 == t.length()) return oneWayInsert(t, s);
        else if(s.length() == t.length()+1) return oneWayInsert(s, t);
        else return false;
    }

    private static boolean oneWayReplace(String s, String t) {
        int found = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)) {
                if(found > 0) return false;
                found++;
            }
        }
        return true;
    }

    private static boolean oneWayInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < first.length() && index2 < second.length()) {
            if(first.charAt(index1) != second.charAt(index2)) {
                if(index1 != index2) return false;

                index1++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[][] str = {{"pale", "ple"}, {"pales", "pale"}, {"pale", "bale"}, {"pale", "bake"}};
        for(String[] s: str) {
            System.out.println(oneWayEdit(s[0], s[1]));
        }
    }
}
