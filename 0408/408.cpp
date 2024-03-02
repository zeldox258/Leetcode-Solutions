class Solution {
public:
    int validWordAbbreviation(TreeNode* root) {
        if(!root) return 0;
        return 1+max(validWordAbbreviation(root->left),validWordAbbreviation(root->right));
    }
};