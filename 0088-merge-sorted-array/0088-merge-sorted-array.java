class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int j=0;
        for(int i=m;i<m+n;i++){
            int temp = nums1[i];
            nums1[i] = nums2[j];
            nums2[j] = temp;
            j++;
        }
        Arrays.sort(nums1);
    }
}