class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        double res;
        int nums3[]=new int[c];
        System.arraycopy(nums1,0,nums3,0,a);
        System.arraycopy(nums2,0,nums3,a,b);
        Arrays.sort(nums3);
        if(c%2!=0){
            return nums3[c/2];
        }
        else{
             res= (nums3[c/2-1]+nums3[c/2])/2.0;
    
        }
        return res;
        
    }
}
