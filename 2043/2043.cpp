class Solution {
public:
    int simpleBankSystem(TreeNode* root) {
        if(!root) return 0;
        return 1+max(simpleBankSystem(root->left),simpleBankSystem(root->right));
    }
};