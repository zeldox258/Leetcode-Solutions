int randomPickWithWeight(struct TreeNode* root) {
    if (!root) return 0;
    int l = randomPickWithWeight(root->left);
    int r = randomPickWithWeight(root->right);
    return 1 + (l > r ? l : r);
}