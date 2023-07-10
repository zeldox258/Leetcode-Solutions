
class Solution {
    public int[] numMovesStonesII(int[] stones) {
        java.util.Arrays.sort(stones); int n=stones.length;
        int maxMoves=Math.max(stones[n-1]-stones[1]-(n-2),stones[n-2]-stones[0]-(n-2)); int minMoves=n;
        for(int i=0,j=0;i<n;i++){while(j+1<n&&stones[j+1]-stones[i]<=n-1)j++;int inWindow=j-i+1;if(inWindow==n-1&&stones[j]-stones[i]==n-2)minMoves=Math.min(minMoves,2);else minMoves=Math.min(minMoves,n-inWindow);}
        return new int[]{minMoves,maxMoves};
    }
}
