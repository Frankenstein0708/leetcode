class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int start = starting(nums,target);
        int end = ending(nums, target);
        result[0] = start;
        result[1] = end;
        return result;
        
    }

    public int starting(int[] nums, int target)
    {
        int low = 0;
        int res = -1;
        int high = nums.length -1;
        int[] result = new int[2];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
                if(target<=nums[mid])
                {
                    high = mid-1;
                }
                else 
                {
                    low = mid+1;
                }
                if (target == nums[mid]) res = mid;
                
            
        }
        return res;
    }
    public int ending(int[] nums, int target)
    {
        int low = 0;
        int res = -1;
        int high = nums.length -1;
        int[] result = new int[2];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            
                if(target>=nums[mid])
                {
                    low = mid+1;
                }
                else 
                {
                    high = mid-1;
                }
                if (target == nums[mid]) res = mid;


        }
        return res;
    }


}