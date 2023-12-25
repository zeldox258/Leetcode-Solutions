int totalWavinessOfNumbersInRangeI(struct TreeNode* root) {
    if (!root) return 0;
    int l = totalWavinessOfNumbersInRangeI(root->left);
    int r = totalWavinessOfNumbersInRangeI(root->right);
    return 1 + (l > r ? l : r);
}