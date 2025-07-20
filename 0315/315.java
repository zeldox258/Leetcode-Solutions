
import java.util.*;
class Solution {
    int[] bit;
    int n;
    public List<Integer> countSmaller(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> rank = new HashMap<>();
        for (int i=0;i<sorted.length;i++) rank.put(sorted[i],i+1);
        n = nums.length; bit = new int[n+1];
        List<Integer> res = new ArrayList<>();
        for (int i=n-1;i>=0;i--) {
            res.add(0, query(rank.get(nums[i])-1));
            update(rank.get(nums[i]));
        }
        return res;
    }
    void update(int i) { for(;i<=n;i+=i&(-i)) bit[i]++; }
    int query(int i) { int s=0; for(;i>0;i-=i&(-i)) s+=bit[i]; return s; }
}
