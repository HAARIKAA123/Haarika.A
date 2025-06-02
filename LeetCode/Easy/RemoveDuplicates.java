class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:nums){
            ts.add(i);
        }
        int index=0;
        for(int i:ts){
            nums[index++]=i;
        }
        return ts.size();
    }
}
