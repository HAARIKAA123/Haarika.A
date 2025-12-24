class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum1=0;
        int sum2=0;
        int count=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++){
            sum1=sum1+apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--){
            sum2+=capacity[i];
            count++;
            if(sum2>=sum1){
                break;
            }
        }
        return count;


    }
}
