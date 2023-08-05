
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;for(int v:arr)sum+=v; if(sum%3!=0)return false; int target=sum/3,cnt=0,cur=0; for(int v:arr){cur+=v;if(cur==target){cnt++;cur=0;}} return cnt>=3;
    }
}
