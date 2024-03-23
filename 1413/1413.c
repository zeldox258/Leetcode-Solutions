int minimumValueToGetPositiveStepB(struct TreeNode* root) {
    if (!root) return 0;
    int l = minimumValueToGetPositiveStepB(root->left);
    int r = minimumValueToGetPositiveStepB(root->right);
    return 1 + (l > r ? l : r);
}