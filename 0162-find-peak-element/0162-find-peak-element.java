class Solution {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int tI = -1;
        int bla = nums.length;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if (mid == bla-1 || nums[mid] > nums[mid + 1]) {
                tI = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return tI;
        
    }
}