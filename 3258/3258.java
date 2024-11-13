class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0, r=0, zeros=0, ones=0, res = 0;

        for(r=0; r < s.length(); r++){
            if(s.charAt(r) == '1') {
                ones +=1;
            }else{
                zeros +=1;
            }
            while(ones>k && zeros>k){
                if(s.charAt(l) == '1') {
                    ones -=1;
                }else{
                    zeros -=1;
                }
                l +=1;
            }
            res += r-l+1;
        }
        return res;
    }
}