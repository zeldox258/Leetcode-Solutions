class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int [] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDifference &&
                Math.abs(nums[i]-nums[j])>=valueDifference){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }

        }
        return res;
    }
}