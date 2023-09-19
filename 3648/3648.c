int minimumSensorsToCoverGrid(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumSensorsToCoverGrid(root->left);
    int r = minimumSensorsToCoverGrid(root->right);
    return 1 + (l > r ? l : r);
}