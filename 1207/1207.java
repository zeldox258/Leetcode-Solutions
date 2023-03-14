
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> cnt=new HashMap<>();
        for(int a:arr) cnt.merge(a,1,Integer::sum);
        return cnt.size()==new HashSet<>(cnt.values()).size();
    }
}
