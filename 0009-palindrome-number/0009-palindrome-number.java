import java.util.*;

class Solution {
    public boolean isPalindrome(int a) {
        if (a < 0) {
            return false;
        }
        int temp = 0;
        int sum = 0;
        int original = a;
        while (a != 0) {
            temp = a % 10;
            sum = (sum * 10) + temp;
            a = a / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(a));
    }
}
