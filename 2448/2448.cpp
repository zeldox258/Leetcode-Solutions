class Solution {
public:
    int minimumCostToMakeArrayEqual(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumCostToMakeArrayEqual(root->left),minimumCostToMakeArrayEqual(root->right));
    }
};