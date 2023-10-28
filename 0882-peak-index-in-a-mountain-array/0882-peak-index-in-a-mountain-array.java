class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low =0;
        int high = arr.length-1;
        int tI = -1;
        int bla = arr.length;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if (mid == bla-1 || arr[mid] > arr[mid + 1]) {
                tI = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return tI;
        
    }
}