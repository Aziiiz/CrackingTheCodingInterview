package ArraysAndString;

public class PalindromePermutation {

    private static boolean isPalindromePermutation(String s) {
        int[] letter = new int[26];
        int odds = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if(c != ' ') {
                int pos = c - 'a';
                letter[pos]++;

                if (letter[pos] % 2 == 1) {
                    odds++;
                } else {
                    odds--;
                }
            }
        }
        return odds <= 1;
    }


    private static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (Character.isLetterOrDigit(s.charAt(low))) {
                low++;
                continue;
            }

            if (Character.isLetterOrDigit(s.charAt(high))) {
                high--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) return false;
            low++;
            high--;
        }
        return true;
    }


    public static void main(String[] args) {
        String pali = "Ratzs live on no evil starz";
        System.out.println(isPalindromePermutation(pali));
        System.out.println(isPalindrome(pali));


    }

}
