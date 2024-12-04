class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - nums[i];
            if (map.containsKey(num2)) {
                output[0] = i;
                output[1] = map.get(num2);
                return output;
            }
            map.put(nums[i], i);
        }
        return output;
    }
}