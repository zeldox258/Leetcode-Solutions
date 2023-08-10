
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res=Math.min(check(tops[0],tops,bottoms),check(bottoms[0],tops,bottoms)); return res==Integer.MAX_VALUE?-1:res;
    }
    int check(int x,int[]T,int[]B){int rotT=0,rotB=0;for(int i=0;i<T.length;i++){if(T[i]!=x&&B[i]!=x)return Integer.MAX_VALUE;else if(T[i]!=x)rotT++;else if(B[i]!=x)rotB++;}return Math.min(rotT,rotB);}
}
