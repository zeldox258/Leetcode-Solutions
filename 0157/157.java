class Solution {
    public int read(char[] buf, int n) {
        char[] tmp=new char[4];int total=0;
        while(total<n){int cnt=read4(tmp);int take=Math.min(cnt,n-total);for(int i=0;i<take;i++) buf[total++]=tmp[i];if(cnt<4)break;}
        return total;
    }
    int read4(char[] buf4){return 0;}
}