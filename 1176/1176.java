
class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int res=0,sum=0;
        for(int i=0;i<calories.length;i++){
            sum+=calories[i];
            if(i>=k) sum-=calories[i-k];
            if(i>=k-1){ if(sum<lower)res--;else if(sum>upper)res++; }
        }
        return res;
    }
}
