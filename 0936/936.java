
class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[]s=stamp.toCharArray(),t=target.toCharArray(); int m=s.length,n=t.length;
        boolean[]visited=new boolean[n-m+1]; java.util.List<Integer> res=new java.util.ArrayList<>(); int total=0;
        while(total<n){boolean found=false;for(int i=0;i<=n-m&&!found;i++){if(!visited[i]&&canStamp(t,s,i)){visited[i]=true;int stamped=doStamp(t,i,m);if(stamped>0){total+=stamped;res.add(i);found=true;}}}if(!found)return new int[0];}
        java.util.Collections.reverse(res); return res.stream().mapToInt(Integer::intValue).toArray();
    }
    boolean canStamp(char[]t,char[]s,int i){for(int j=0;j<s.length;j++)if(t[i+j]!='?'&&t[i+j]!=s[j])return false;for(int j=0;j<s.length;j++)if(t[i+j]==s[j])return true;return false;}
    int doStamp(char[]t,int i,int m){int cnt=0;for(int j=0;j<m;j++)if(t[i+j]!='?'){t[i+j]='?';cnt++;}return cnt;}
}
