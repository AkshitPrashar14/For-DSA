class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1=0;
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1)c1++;
            else{
                c1=0;
            }
            c=Math.max(c,c1);
        }
        return c;
    }
}