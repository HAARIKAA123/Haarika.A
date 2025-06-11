class Solution {
    public int mySqrt(int x) {
        double res=Math.sqrt(x);
        int round=(int) Math.floor(res);
        return round;
    }
}
