import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int target = sc.nextInt();
        String[] b = a.split(",");

        int[] nums = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            nums[i] = Integer.parseInt(b[i]);
        }

        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}