class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];


        int i = 0;

        // first fill smaller element
        for(int n : nums){
            if(n < pivot) ans[i++] = n;
        }


        // now fill pivot
        for(int n : nums){
            if(n == pivot) ans[i++] = n;
        }


        // Now fill Greater element
        for(int n : nums){
            if(n > pivot){
                ans[i++] = n;
            }
        }

        return ans;

    }
}