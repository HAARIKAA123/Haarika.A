import java.util.*;
import java.util.Arrays;
class Solution{
    public int[] intersect(int[] nums1,int[] nums2){
        ArrayList<Integer> al= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<=nums1.length-1&&j<=nums2.length-1){
            if(nums1[i]==nums2[j]){
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
        }
        int arr[]= new int[al.size()];
        for(int k=0;k<al.size();k++){
            arr[k]=al.get(k);
        }
        return arr;
    }
}
