int countSubstringsThatSatisfyKcon(struct TreeNode* root) {
    if (!root) return 0;
    int l = countSubstringsThatSatisfyKcon(root->left);
    int r = countSubstringsThatSatisfyKcon(root->right);
    return 1 + (l > r ? l : r);
}