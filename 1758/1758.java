class Solution {
    public int minOperations(String s) {
        int res1 = 0 , res2 = 0;
        for(int i = 0;i<s.length();i++){
            int val = s.charAt(i)-'0';
            if(i%2 == 0){
                res1+= val^1;
                res2+= val^0;
            }
            else{
                res1+= val^0;
                res2+= val^1;
            }
        }
        return Math.min(res1,res2);
    }
}