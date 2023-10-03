class Solution {
public:
    int addDigits(TreeNode* root) {
        if(!root) return 0;
        return 1+max(addDigits(root->left),addDigits(root->right));
    }
};