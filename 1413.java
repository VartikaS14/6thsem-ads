class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int curr=0;
        int min=0;
        for(int i=0;i<n;i++)
        {
            curr +=nums[i];
            if(curr<=1)
            {
                min=Math.min(curr,min);
            }
        }
        return 1-min;
    }
}
