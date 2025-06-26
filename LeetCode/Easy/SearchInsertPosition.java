class Solution {
    public int searchInsert(int[] nums, int target) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int num:nums) {
            tm.put(num, num);  // index as key, array value as value
        }
        if(!tm.containsValue(target)){
            tm.put(target,target);
        }
        List<Integer> keyList = new ArrayList<>(tm.keySet());
        return keyList.indexOf(target);
    }
}
