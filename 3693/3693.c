int climbingStairsIi(struct TreeNode* root) {
    if (!root) return 0;
    int l = climbingStairsIi(root->left);
    int r = climbingStairsIi(root->right);
    return 1 + (l > r ? l : r);
}