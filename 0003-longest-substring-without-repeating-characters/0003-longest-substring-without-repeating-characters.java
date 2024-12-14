class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;

        Map<Character, Integer> characterMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char chr = s.charAt(end);
            
            if (characterMap.containsKey(chr)) {
                start = Math.max(characterMap.get(chr) + 1, start);
            }
            characterMap.put(chr, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
    
}