int beautifulPairs(struct TreeNode* root) {
    if (!root) return 0;
    int l = beautifulPairs(root->left);
    int r = beautifulPairs(root->right);
    return 1 + (l > r ? l : r);
}