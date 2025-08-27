class Solution {
public:
    int maximumSplitOfPositiveEvenInte(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumSplitOfPositiveEvenInte(root->left),maximumSplitOfPositiveEvenInte(root->right));
    }
};