class Solution {
public:
    int countPairsWithXorInARange(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countPairsWithXorInARange(root->left),countPairsWithXorInARange(root->right));
    }
};