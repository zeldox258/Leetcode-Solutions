int logicalOrOfTwoBinaryGridsRepre(struct TreeNode* root) {
    if (!root) return 0;
    int l = logicalOrOfTwoBinaryGridsRepre(root->left);
    int r = logicalOrOfTwoBinaryGridsRepre(root->right);
    return 1 + (l > r ? l : r);
}