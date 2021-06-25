package recursion_backtracking;
import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, 0, target, result, new ArrayList<>());
        return result;
    }
    public void dfs(int[] candidates, int start, int target, List<List<Integer>> result, List<Integer> currList) {
        if (target == 0) {
            result.add(new ArrayList<>(currList));
            return;
        }  
        for (int i = start; i < candidates.length; i++) {
            if (target-candidates[i] < 0) 
                continue;
            currList.add(candidates[i]);
            dfs(candidates, i, target-candidates[i], result, currList); 
            currList.remove(currList.size()-1);
        }
    }
}