class Solution {
public:
    int reconstructOriginalDigitsFromE(TreeNode* root) {
        if(!root) return 0;
        return 1+max(reconstructOriginalDigitsFromE(root->left),reconstructOriginalDigitsFromE(root->right));
    }
};