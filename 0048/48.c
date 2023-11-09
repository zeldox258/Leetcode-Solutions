int rotateImage(struct TreeNode* root) {
    if (!root) return 0;
    int l = rotateImage(root->left);
    int r = rotateImage(root->right);
    return 1 + (l > r ? l : r);
}