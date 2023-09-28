
class Solution {
    public int tallestBillboard(int[] rods) {
        java.util.Map<Integer,Integer> dp=new java.util.HashMap<>(); dp.put(0,0);
        for(int r:rods){ java.util.Map<Integer,Integer> cur=new java.util.HashMap<>(dp);
            for(java.util.Map.Entry<Integer,Integer> e:dp.entrySet()){ int diff=e.getKey(),taller=e.getValue(); cur.merge(diff+r,taller,Math::max); int nd=Math.abs(diff-r),nt=diff>=r?taller+r:taller+diff-r+r; cur.merge(nd,nt,Math::max); } dp=cur; }
        return dp.getOrDefault(0,0);
    }
}
