class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(candidates, 0, target, new ArrayList<>(), resultList);
        return resultList;
    }

    public void backtracking(int[] candidates, int start, int target, List<Integer> usedList, List<List<Integer>> resultList) {
        if (target == 0) {
            resultList.add(new ArrayList<>(usedList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }

            usedList.add(candidates[i]);
            backtracking(candidates, i, target - candidates[i], usedList, resultList);
            
            usedList.remove(usedList.size() - 1);
        }

    }    
}