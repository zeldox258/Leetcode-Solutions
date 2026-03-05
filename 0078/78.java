import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int n:nums){
            int size=res.size();
            for(int i=0;i<size;i++){List<Integer> sub=new ArrayList<>(res.get(i));sub.add(n);res.add(sub);}
        }
        return res;
    }
}