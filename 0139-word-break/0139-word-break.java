class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(0);

        while (queue.isEmpty() == false) {
            int start = queue.poll();

            if (start == s.length()) {
                return true;
            }

            if (visited.contains(start)) {
                continue;
            }
            
            visited.add(start);
            
            for (int end = start + 1; end <= s.length(); end++) {
                if (wordDictSet.contains(s.substring(start, end))) {
                    queue.add(end);
                }
            }            
        }

        return false;
    }
}