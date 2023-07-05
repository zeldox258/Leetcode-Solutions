int bestTimeToBuyAndSellStockV(struct TreeNode* root) {
    if (!root) return 0;
    int l = bestTimeToBuyAndSellStockV(root->left);
    int r = bestTimeToBuyAndSellStockV(root->right);
    return 1 + (l > r ? l : r);
}