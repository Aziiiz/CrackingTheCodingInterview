package RecursionAndDynamicProgramming;

public class TripleStep {

    private static int tripleStep(int n) {
        if(n == 0) return n;
        if(n == 1 || n == 2) return 1;
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = memo[2] = 1;
        for(int i=3; i<n; i++) {
            memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
        }
        return memo[n-1] + memo[n-2] + memo[n-3];
    }

    public static void main(String[] args) {
        int n = 37;
        System.out.println(tripleStep(n));
    }
}
