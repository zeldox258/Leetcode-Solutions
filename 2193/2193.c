int minimumNumberOfMovesToMakePali(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumNumberOfMovesToMakePali(root->left);
    int r = minimumNumberOfMovesToMakePali(root->right);
    return 1 + (l > r ? l : r);
}