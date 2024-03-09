class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        int size = nums.length;

        for (int i = 0; i < size; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> pair : freq.entrySet()) {
            if (pair.getValue() > maxFrequency) {
                maxFrequency = pair.getValue();
            }
        }

        int maxElements = 0;
        for (Map.Entry<Integer, Integer> pair : freq.entrySet()) {
            if (pair.getValue() == maxFrequency) {
                maxElements++;
            }
        }

        return maxElements * maxFrequency;
    }

}