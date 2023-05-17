class Solution {
public:
    int separateTheDigitsInAnArray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(separateTheDigitsInAnArray(root->left),separateTheDigitsInAnArray(root->right));
    }
};