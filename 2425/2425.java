class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int all2 = 0;
        if(n1 % 2 != 0){
            for(int i = 0; i < n2; i++){
                all2 = all2 ^ nums2[i];
            }
        }

        int all1 = 0;
        if(n2 % 2 != 0){
            for(int i = 0; i < n1; i++){
                all1 = all1 ^ nums1[i];
            }
        }

        return all1 ^ all2;
    }
}