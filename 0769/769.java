class Solution {
    public int maxChunksToSorted(int[] arr) {

        int firstSum=0;
        int interSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            interSum+=arr[i];
            firstSum+=i;
            if(interSum==firstSum){
                count++;
                firstSum=0;
                interSum=0;
            }
        }
        return count;
    }
}