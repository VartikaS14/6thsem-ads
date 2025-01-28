class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum +=nums[i];
        }
        int preSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(preSum == sum-preSum-nums[i])
            {
                return i;
            }
            preSum +=nums[i];
            //System.out.print(preSum);
        }
        return -1;
    }
}
