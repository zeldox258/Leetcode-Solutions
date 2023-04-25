
class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int n=req_skills.length, m=people.size();
        Map<String,Integer> idx=new HashMap<>();
        for(int i=0;i<n;i++) idx.put(req_skills[i],i);
        long[] dp=new long[1<<n];
        Arrays.fill(dp,-1); dp[0]=0;
        int[] prev=new int[1<<n];
        int[] pidx=new int[1<<n];
        for(int i=0;i<m;i++){
            int skill=0;
            for(String s:people.get(i)) if(idx.containsKey(s)) skill|=1<<idx.get(s);
            for(int mask=0;mask<(1<<n);mask++){
                if(dp[mask]==-1) continue;
                int next=mask|skill;
                if(dp[next]==-1||Long.bitCount(dp[next])>Long.bitCount(dp[mask])+1){
                    dp[next]=dp[mask]|(1L<<i);
                    prev[next]=mask; pidx[next]=i;
                }
            }
        }
        long bits=dp[(1<<n)-1];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<m;i++) if(((bits>>i)&1)==1) res.add(i);
        return res.stream().mapToInt(x->x).toArray();
    }
}
