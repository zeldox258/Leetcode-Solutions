class Solution {
public:
    int bestTimeToBuyAndSellStockV(TreeNode* root) {
        if(!root) return 0;
        return 1+max(bestTimeToBuyAndSellStockV(root->left),bestTimeToBuyAndSellStockV(root->right));
    }
};