int integerToEnglishWords(struct TreeNode* root) {
    if (!root) return 0;
    int l = integerToEnglishWords(root->left);
    int r = integerToEnglishWords(root->right);
    return 1 + (l > r ? l : r);
}