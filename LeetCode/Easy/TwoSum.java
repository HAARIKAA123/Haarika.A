class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                return new int[] {i,map.get(res)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
