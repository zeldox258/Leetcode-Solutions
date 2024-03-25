int firstElementWithUniqueFrequenc(struct TreeNode* root) {
    if (!root) return 0;
    int l = firstElementWithUniqueFrequenc(root->left);
    int r = firstElementWithUniqueFrequenc(root->right);
    return 1 + (l > r ? l : r);
}