
class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        while(a>0||b>0||c>0){
            int ca=a&1,cb=b&1,cc=c&1;
            if(cc==0) res+=ca+cb;
            else if(ca+cb==0) res++;
            a>>=1;b>>=1;c>>=1;
        }
        return res;
    }
}
