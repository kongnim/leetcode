class Solution {
    public int maxArea(int[] height) {
        // 1) brute force -> O(n^2), time out
        // int maxAmount = 0;

        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i + 1; j < height.length; j++) {
        //         maxAmount = Math.max(maxAmount, (j - i) * Math.min(height[i], height[j]));
        //     }
        // }

        // return maxAmount;

        // 2) two pointer -> O(n)

        int maxAmount = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            maxAmount = Math.max(maxAmount, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        
        return maxAmount;
    }
}