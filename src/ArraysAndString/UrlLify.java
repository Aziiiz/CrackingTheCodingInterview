package ArraysAndString;

public class UrlLify {

    private static String urlLify(String s) {
        char[] sChars = s.toCharArray();
        int space = 0;
        int trueLength = findLastCharacter(sChars) + 1;
        for(int i=0; i<trueLength; i++) {
            if(sChars[i] == ' ') space++;
        }

        int index = trueLength + space * 2;
        for(int i=trueLength - 1; i>=0; i--) {
            if(sChars[i] == ' ') {
                sChars[index-1] = '0';
                sChars[index-2] = '2';
                sChars[index-3] = '%';
                index -= 3;
            }else {
                sChars[index-1] = sChars[i];
                index--;
            }
        }

        return new String(sChars);

    }


    private static int findLastCharacter(char[] str) {
        for(int i = str.length-1; i>=0; i--) {
            if(str[i] != ' ') return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";

        System.out.println(urlLify(str));
    }
}
