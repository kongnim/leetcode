class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        
        boolean[] memo = new boolean[s.length() + 1];
        memo[0] = true;

        for (int j = 1; j <= s.length(); j++) {
            for (int i = Math.max(0, j - 20); i < j; i++) { // 1 <= wordDict[i].length <= 20
                if (memo[i] && wordDictSet.contains(s.substring(i, j))) {
                    memo[j] = true;
                    break;
                }
            }
        }
        return memo[s.length()];
    }
}