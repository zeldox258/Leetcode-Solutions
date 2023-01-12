
class Solution {
    int[][] pos=new int[26][2];
    Integer[][][] memo;
    public int minimumDistance(String word) {
        String kb="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<26;i++){pos[kb.charAt(i)-'a'][0]=i/10;pos[kb.charAt(i)-'a'][1]=i%10;}
        memo=new Integer[word.length()][27][27];
        return dfs(word,0,26,26);
    }
    int dist(int a,int b){
        if(a==26) return 0;
        return Math.abs(pos[a][0]-pos[b][0])+Math.abs(pos[a][1]-pos[b][1]);
    }
    int dfs(String w,int i,int f1,int f2){
        if(i==w.length()) return 0;
        if(memo[i][f1][f2]!=null) return memo[i][f1][f2];
        int c=w.charAt(i)-'a';
        int r=Math.min(dist(f1,c)+dfs(w,i+1,c,f2),dist(f2,c)+dfs(w,i+1,f1,c));
        return memo[i][f1][f2]=r;
    }
}
