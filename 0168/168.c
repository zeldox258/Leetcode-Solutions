int excelSheetColumnTitle(struct TreeNode* root) {
    if (!root) return 0;
    int l = excelSheetColumnTitle(root->left);
    int r = excelSheetColumnTitle(root->right);
    return 1 + (l > r ? l : r);
}