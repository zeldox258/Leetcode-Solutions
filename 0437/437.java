
import java.util.*;
class Solution {
    public int pathSum(TreeNode root, long targetSum) {
        Map<Long,Integer> map=new HashMap<>(); map.put(0L,1);
        return dfs(root,0,targetSum,map);
    }
    int dfs(TreeNode node,long cur,long target,Map<Long,Integer> map){
        if(node==null) return 0;
        cur+=node.val; int res=map.getOrDefault(cur-target,0);
        map.merge(cur,1,Integer::sum);
        res+=dfs(node.left,cur,target,map)+dfs(node.right,cur,target,map);
        map.merge(cur,-1,Integer::sum); return res;
    }
}
