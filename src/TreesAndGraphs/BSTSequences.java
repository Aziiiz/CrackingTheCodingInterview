package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;

public class BSTSequences {

    public long[][] triangle;
    public static final long mod = 1000000007;
    private int BSTsequence(int[] nums) {
            if(triangle == null) buildTriangle();

            List<Integer> list = new ArrayList<>();
            for(int n : nums) list.add(n);

            return (int) numbOfWays(list) -1;

    }

    private long numbOfWays(List<Integer> list) {
        if(list.size() <= 2) return 1;

        int root = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int node : list) {
            if(root > node) {
                left.add(node);
            }else if(root < node) {
                right.add(node);
            }
        }
        return (
                triangle[left.size()+ right.size()][right.size()] % mod *
                        numbOfWays(left) % mod *
                        numbOfWays(right) % mod
                );
    }

    private void buildTriangle() {
        int n = 1000;
        triangle = new long[n][n];
        for(int i=0; i<n; i++) {
            triangle[i][0] = triangle[i][i] = 1;
        }

        for(int i=2; i<n; i++) {
            for(int j=1; j<i; j++) {
                triangle[i][j] = (triangle[i-1][j] + triangle[i-1][j-1]) % mod;
            }
        }
    }
}
