
import java.util.*;
class Solution {
    Map<Integer,List<Integer>> map=new HashMap<>(); Random rand=new Random();
    public Solution(int[] nums){for(int i=0;i<nums.length;i++)map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);}
    public int pick(int target){List<Integer> list=map.get(target);return list.get(rand.nextInt(list.size()));}
}
