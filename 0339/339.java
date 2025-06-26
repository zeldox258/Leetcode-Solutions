
import java.util.*;
class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList,1);
    }
    int dfs(List<NestedInteger> list, int depth) {
        int sum=0;
        for (NestedInteger ni:list)
            if (ni.isInteger()) sum+=ni.getInteger()*depth;
            else sum+=dfs(ni.getList(),depth+1);
        return sum;
    }
}
