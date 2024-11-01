int countSubstringsThatDifferByOne(struct TreeNode* root) {
    if (!root) return 0;
    int l = countSubstringsThatDifferByOne(root->left);
    int r = countSubstringsThatDifferByOne(root->right);
    return 1 + (l > r ? l : r);
}