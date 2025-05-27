
import java.util.*;
class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        int unweighted=0,weighted=0;
        while(!nestedList.isEmpty()){
            List<NestedInteger> next=new ArrayList<>();
            for(NestedInteger ni:nestedList){
                if(ni.isInteger()) unweighted+=ni.getInteger();
                else next.addAll(ni.getList());
            }
            weighted+=unweighted; nestedList=next;
        }
        return weighted;
    }
}
