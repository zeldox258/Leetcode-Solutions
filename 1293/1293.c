int shortestPathInAGridWithObstacl(struct TreeNode* root) {
    if (!root) return 0;
    int l = shortestPathInAGridWithObstacl(root->left);
    int r = shortestPathInAGridWithObstacl(root->right);
    return 1 + (l > r ? l : r);
}