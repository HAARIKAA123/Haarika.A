class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
      //  System.out.println(s.length());
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            count++;
            if(ch==' '){
                count--;
                break;
            }
        }
        return count;
    }
}
