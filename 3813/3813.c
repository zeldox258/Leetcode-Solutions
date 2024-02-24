int vowelconsonantScore(struct TreeNode* root) {
    if (!root) return 0;
    int l = vowelconsonantScore(root->left);
    int r = vowelconsonantScore(root->right);
    return 1 + (l > r ? l : r);
}