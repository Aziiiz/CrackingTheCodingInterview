package RecursionAndDynamicProgramming;

import java.util.*;

public class Permutation_II {
    List<List<Integer>> list;
    Set<String> dupl;
    public List<List<Integer>> permuteUnique(int[] nums) {
        list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        dupl = new HashSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        backtracking(nums, set, linkedList);
        return list;


    }

    private void backtracking(int[] nums, Set<Integer> usedIndex, LinkedList<Integer> temp) {
        if(temp.size() == nums.length) {
            if(check(temp)) list.add(new LinkedList(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(usedIndex.contains(i)) {
                continue;
            }else {
                usedIndex.add(i);
                temp.add(nums[i]);

                backtracking(nums, usedIndex, temp);

                temp.removeLast();

                usedIndex.remove(i);
            }
        }
    }

    private boolean check(LinkedList<Integer> l) {
        List<Integer> t = new ArrayList<>(new LinkedList(l));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t.size(); i++) {
            sb.append(t.get(i));
        }
        if(dupl.contains(sb.toString())) return false;
        dupl.add(sb.toString());
        return true;
    }
}
