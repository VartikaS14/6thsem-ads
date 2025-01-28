class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[] prefix=new int[gain.length+1];
        for(int i=1;i<gain.length+1;i++)
        {
            prefix[i]=prefix[i-1]+gain[i-1];
            if(prefix[i]>max)
            {
                max=prefix[i];
            }
            //System.out.print(prefix[i]+" ");
        }
       
        return max;
        
    }
}
