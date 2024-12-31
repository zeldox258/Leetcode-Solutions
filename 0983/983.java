class Solution {
    int[] costs;
    int[] memo;
    Set<Integer> set=new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        this.costs=costs;
        memo=new int[days[days.length-1]];
        for(int day:days){
            set.add(day);
        }
        return dp(days[days.length-1]);
    }

    public int dp(int i){
        if(i<=0){
            return 0;
        }
        if(memo[i-1]!=0){
            return memo[i-1];
        }
        int res;
        if(set.contains(i)){
            int one=dp(i-1)+costs[0];
            int seven=dp(i-7)+costs[1];
            int thirty=dp(i-30)+costs[2];
            res=Math.min(one,Math.min(seven,thirty));
        }
        else{
            res=dp(i-1);
        }
        memo[i-1]=res;
        return res;
    }
}