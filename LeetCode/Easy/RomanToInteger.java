class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);
       int total=0;
       int length=s.length();
       for(int i=0;i<s.length();i++){
        int curr=hm.get(s.charAt(i));
        if(i<length-1 && curr<hm.get(s.charAt(i+1))){
            total=total-curr;
        }
        else{
            total=total+curr;
        }
       }
       return total;
    }
}
