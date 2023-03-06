
class Solution {
    public int balancedStringSplit(String s) {
        int res=0,bal=0;
        for(char c:s.toCharArray()){
            if(c=='L') bal++; else bal--;
            if(bal==0) res++;
        }
        return res;
    }
}
