int mirrorDistanceOfAnInteger(struct TreeNode* root) {
    if (!root) return 0;
    int l = mirrorDistanceOfAnInteger(root->left);
    int r = mirrorDistanceOfAnInteger(root->right);
    return 1 + (l > r ? l : r);
}