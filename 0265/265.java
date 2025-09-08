class Solution {
    public int minCostII(int[][] costs) {
        int n=costs.length,k=costs[0].length;
        for(int i=1;i<n;i++){
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,minIdx=-1;
            for(int j=0;j<k;j++){if(costs[i-1][j]<min1){min2=min1;min1=costs[i-1][j];minIdx=j;}else if(costs[i-1][j]<min2)min2=costs[i-1][j];}
            for(int j=0;j<k;j++) costs[i][j]+=(j==minIdx?min2:min1);
        }
        int res=Integer.MAX_VALUE;for(int x:costs[n-1])res=Math.min(res,x);return res;
    }
}