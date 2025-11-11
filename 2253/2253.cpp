class Solution {
public:
    int dynamicUnpivotingOfATable(TreeNode* root) {
        if(!root) return 0;
        return 1+max(dynamicUnpivotingOfATable(root->left),dynamicUnpivotingOfATable(root->right));
    }
};