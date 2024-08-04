import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length + nums2.length];
        int i = 0;
        
        for (int b : nums1) {
            a[i] = b;
            i++;
        }
        
        for (int b : nums2) {
            a[i] = b;
            i++;
        }
        
        Arrays.sort(a);
        int mid = a.length / 2;
        
        if (a.length % 2 != 0) {
            return (double) a[mid];
        } else {
            return (double) (a[mid] + a[mid - 1]) / 2;
        }
    }
}
