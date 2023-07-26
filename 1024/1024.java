
class Solution {
    public int videoStitching(int[][] clips, int time) {
        int[]maxEnd=new int[time+1];for(int[]c:clips)if(c[0]<=time)maxEnd[c[0]]=Math.max(maxEnd[c[0]],c[1]);
        int res=0,curEnd=0,prevEnd=0; for(int i=0;i<=time;i++){if(i>curEnd)return -1;if(i>prevEnd){res++;prevEnd=curEnd;}curEnd=Math.max(curEnd,maxEnd[i]);}
        return res;
    }
}
