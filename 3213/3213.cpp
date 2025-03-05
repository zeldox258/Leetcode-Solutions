class Solution {
public:
    int constructStringWithMinimumCost(TreeNode* root) {
        if(!root) return 0;
        return 1+max(constructStringWithMinimumCost(root->left),constructStringWithMinimumCost(root->right));
    }
};