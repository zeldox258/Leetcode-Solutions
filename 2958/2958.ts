function lengthOfLongestSubarrayWithAtM(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(lengthOfLongestSubarrayWithAtM(root.left), lengthOfLongestSubarrayWithAtM(root.right));
}