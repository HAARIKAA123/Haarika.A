class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currcount++;
                maxcount=Math.max(currcount,maxcount);
            }
            else{
                currcount=-0;
            }
        }
        return maxcount;

    }
}
