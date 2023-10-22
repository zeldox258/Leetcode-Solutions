int minimumMovesToMoveABoxToTheirT(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumMovesToMoveABoxToTheirT(root->left);
    int r = minimumMovesToMoveABoxToTheirT(root->right);
    return 1 + (l > r ? l : r);
}