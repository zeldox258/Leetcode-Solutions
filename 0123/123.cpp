class Solution {
public:
    int bestTimeToBuyAndSellStockIii(TreeNode* root) {
        if(!root) return 0;
        return 1+max(bestTimeToBuyAndSellStockIii(root->left),bestTimeToBuyAndSellStockIii(root->right));
    }
};