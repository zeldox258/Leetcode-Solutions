
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    TreeNode build(int[] nums, int l, int r) {
        if (l > r) return null;
        int idx = l;
        for (int i = l + 1; i <= r; i++) if (nums[i] > nums[idx]) idx = i;
        TreeNode node = new TreeNode(nums[idx]);
        node.left = build(nums, l, idx - 1);
        node.right = build(nums, idx + 1, r);
        return node;
    }
}
