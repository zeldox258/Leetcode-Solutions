int numberOfBeautifulPairs(struct TreeNode* root) {
    if (!root) return 0;
    int l = numberOfBeautifulPairs(root->left);
    int r = numberOfBeautifulPairs(root->right);
    return 1 + (l > r ? l : r);
}