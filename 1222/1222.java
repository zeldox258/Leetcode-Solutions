
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<String> qs=new HashSet<>();
        for(int[] q:queens) qs.add(q[0]+","+q[1]);
        List<List<Integer>> res=new ArrayList<>();
        int[][] dirs={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int[] d:dirs){
            int r=king[0]+d[0],c=king[1]+d[1];
            while(r>=0&&r<8&&c>=0&&c<8){
                if(qs.contains(r+","+c)){res.add(Arrays.asList(r,c));break;}
                r+=d[0];c+=d[1];
            }
        }
        return res;
    }
}
