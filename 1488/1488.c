int avoidFloodInTheCity(struct TreeNode* root) {
    if (!root) return 0;
    int l = avoidFloodInTheCity(root->left);
    int r = avoidFloodInTheCity(root->right);
    return 1 + (l > r ? l : r);
}