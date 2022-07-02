package RecursionAndDynamicProgramming;

import java.util.*;

public class Permutation {

    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        LinkedList<Integer> temp = new LinkedList<Integer>();
        backTrack(nums, set, temp);
        return list;

    }
    private void backTrack(int[] nums, Set<Integer> usedNums, LinkedList<Integer> temp) {
        if(temp.size() == nums.length) {
            list.add(new LinkedList(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            int n  = nums[i];
            if(usedNums.contains(n)) {
                continue;
            }else {
                usedNums.add(n);
                temp.add(n);

                backTrack(nums, usedNums, temp);

                temp.removeLast();

                usedNums.remove(n);
            }
        }
    }
}
