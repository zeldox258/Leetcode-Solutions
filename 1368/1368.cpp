class Solution {
public:
    int minimumCostToMakeAtLeastOneVal(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumCostToMakeAtLeastOneVal(root->left),minimumCostToMakeAtLeastOneVal(root->right));
    }
};