int bestTimeToBuyAndSellStockIii(struct TreeNode* root) {
    if (!root) return 0;
    int l = bestTimeToBuyAndSellStockIii(root->left);
    int r = bestTimeToBuyAndSellStockIii(root->right);
    return 1 + (l > r ? l : r);
}