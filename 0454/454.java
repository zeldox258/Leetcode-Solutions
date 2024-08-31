
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1)
            for (int b : nums2)
                map.merge(a + b, 1, Integer::sum);
        int count = 0;
        for (int c : nums3)
            for (int d : nums4)
                count += map.getOrDefault(-(c + d), 0);
        return count;
    }
}
