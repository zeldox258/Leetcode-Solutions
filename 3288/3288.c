int lengthOfTheLongestIncreasingPa(struct TreeNode* root) {
    if (!root) return 0;
    int l = lengthOfTheLongestIncreasingPa(root->left);
    int r = lengthOfTheLongestIncreasingPa(root->right);
    return 1 + (l > r ? l : r);
}