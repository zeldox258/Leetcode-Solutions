
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        java.util.Map<Integer,Integer> cnt=new java.util.TreeMap<>(); for(int v:arr) cnt.merge(v,1,Integer::sum);
        for(int k:cnt.keySet()){ if(cnt.get(k)==0) continue; int need=k<0?k/2:k*2; if(k<0&&k%2!=0) return false; int c=cnt.getOrDefault(need,0); if(c<cnt.get(k)) return false; cnt.put(need,c-cnt.get(k)); }
        return true;
    }
}
