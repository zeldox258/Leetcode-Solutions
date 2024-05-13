int shortestWordDistance(struct TreeNode* root) {
    if (!root) return 0;
    int l = shortestWordDistance(root->left);
    int r = shortestWordDistance(root->right);
    return 1 + (l > r ? l : r);
}