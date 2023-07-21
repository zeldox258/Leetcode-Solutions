int findMaximumAreaOfATriangle(struct TreeNode* root) {
    if (!root) return 0;
    int l = findMaximumAreaOfATriangle(root->left);
    int r = findMaximumAreaOfATriangle(root->right);
    return 1 + (l > r ? l : r);
}