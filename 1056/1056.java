
class Solution {
    public boolean confusingNumber(int n) {
        int[]map={0,1,-1,-1,-1,-1,9,-1,8,6}; int orig=n,res=0;
        while(n>0){int d=n%10;if(map[d]==-1)return false;res=res*10+map[d];n/=10;}
        return res!=orig;
    }
}
