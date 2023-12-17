class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int ans=0;

        Arrays.sort(nums1);Arrays.sort(nums2);

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) 
                    return nums1[i];
            }
        }

        int min=Math.min(nums1[0],nums2[0]);
        int max=Math.max(nums1[0],nums2[0]);
        
        return (min*10 +max);
    }
}