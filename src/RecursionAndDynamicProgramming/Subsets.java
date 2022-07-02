package RecursionAndDynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(nums, 0, new Stack<>(), list);
        return list;

    }
    private void backtracking(int[] nums, int position, Stack path, List<List<Integer>> list) {
        if(position == nums.length) {
            list.add(new ArrayList<>(path));
            return;
        }

        path.push(nums[position]);
        backtracking(nums, position+1, path, list);
        path.pop();
        backtracking(nums, position+1, path, list);
    }
}
