class Solution {
public:
    int unitConversionI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(unitConversionI(root->left),unitConversionI(root->right));
    }
};