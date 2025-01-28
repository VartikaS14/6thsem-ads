class Solution {
    public int[] decrypt(int[] code, int k) {
        int s=code.length;
        int[] ans = new int[code.length];
        if(k==0) return ans;
        for(int i=0;i<code.length;i++)
        {
            if(k>0)
            {
                for(int a=1;a<=k;a++)
            {
                ans[i] += code[(i+a)%s];
            }
            }
            else
            {
                for(int a=-1;a>=k;a--)
            {
                ans[i] += code[(i+a+s)%s ];
            }
            }
            
        }
        return ans;
    }
}
