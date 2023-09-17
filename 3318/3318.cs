public class Solution {
    public int FindXsumOfAllKlongSubarraysI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindXsumOfAllKlongSubarraysI(root.left), FindXsumOfAllKlongSubarraysI(root.right));
    }
}