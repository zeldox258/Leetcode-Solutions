
class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n=s.length();
        int[] pre=new int[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]^(1<<(s.charAt(i)-'a'));
        List<Boolean> res=new ArrayList<>();
        for(int[] q:queries){
            int xor=pre[q[1]+1]^pre[q[0]];
            res.add(Integer.bitCount(xor)<=2*q[2]+1);
        }
        return res;
    }
}
