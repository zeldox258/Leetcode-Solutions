class Solution {
   public int addedInteger(int[] nums1, int[] nums2) {
       // Initialize min values for both arrays
       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;

       // Find the minimum in nums1
       for (int num : nums1) {
           if (num < min1) {
               min1 = num;
           }
       }

       // Find the minimum in nums2
       for (int num : nums2) {
           if (num < min2) {
               min2 = num;
           }
       }

       // Return the integer added to nums1 to obtain nums2
       return min2 - min1;
   }
}