
class Solution {
    public String shortestSuperstring(String[] words) {
        int n=words.length; int[][]overlap=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(i!=j){String a=words[i],b=words[j];int max=Math.min(a.length(),b.length());for(int k=max;k>=0;k--)if(b.startsWith(a.substring(a.length()-k))){overlap[i][j]=k;break;}}
        int[][]dp=new int[1<<n][n]; int[][]parent=new int[1<<n][n]; for(int[]r:parent) java.util.Arrays.fill(r,-1);
        for(int mask=1;mask<(1<<n);mask++) for(int i=0;i<n;i++){if((mask&(1<<i))==0)continue;int prev=mask^(1<<i);for(int j=0;j<n;j++){if((prev&(1<<j))==0)continue;int val=dp[prev][j]+overlap[j][i];if(val>dp[mask][i]){dp[mask][i]=val;parent[mask][i]=j;}}}
        int full=(1<<n)-1,last=0; for(int i=1;i<n;i++) if(dp[full][i]>dp[full][last]) last=i;
        java.util.List<Integer> path=new java.util.ArrayList<>(); int mask=full,cur=last;
        while(cur!=-1){path.add(cur);int prev=parent[mask][cur];mask^=(1<<cur);cur=prev;}
        java.util.Collections.reverse(path); StringBuilder sb=new StringBuilder(); sb.append(words[path.get(0)]);
        for(int i=1;i<path.size();i++) sb.append(words[path.get(i)].substring(overlap[path.get(i-1)][path.get(i)]));
        return sb.toString();
    }
}
