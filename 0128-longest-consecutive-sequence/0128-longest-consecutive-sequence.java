class Solution {
    public int longestConsecutive(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // Skip duplicate elements
            if (nums[i] != nums[i - 1]) {
                // Check if the current element is consecutive
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    // Update the longest streak and reset current streak
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        // Return the maximum of the longest streak and the current streak
        return Math.max(longestStreak, currentStreak);
    }
}
