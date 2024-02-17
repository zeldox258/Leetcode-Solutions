class Solution {
public:
    int utf8Validation(TreeNode* root) {
        if(!root) return 0;
        return 1+max(utf8Validation(root->left),utf8Validation(root->right));
    }
};