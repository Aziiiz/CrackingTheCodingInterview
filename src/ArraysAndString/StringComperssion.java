package ArraysAndString;



public class StringComperssion {

    private static String stringCompress(String s) {

        StringBuilder str = new StringBuilder();
        Character c = s.charAt(0);
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) count++;
            else {
                str.append(c);
                str.append(count);
                c = s.charAt(i);
                count = 1;
            }
        }
        str.append(c);
        str.append(count);
        return s.length() > str.toString().length() ? str.toString() : s;
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(stringCompress(str));
    }
}
