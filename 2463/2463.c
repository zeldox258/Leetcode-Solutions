int minimumTotalDistanceTraveled(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumTotalDistanceTraveled(root->left);
    int r = minimumTotalDistanceTraveled(root->right);
    return 1 + (l > r ? l : r);
}