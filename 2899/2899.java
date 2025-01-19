class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int k=0;
        for(int i:nums){
            if(i==-1){
                k++;
                if(seen.size()<k){
                    ans.add(-1);
                }
                else{

                    ans.add(seen.get(k-1));
                }
            }
            else{
                seen.addFirst(i);
                k=0;
            }
        }
        return ans;
    }
}