class Solution {
public:
    int uniqueWordAbbreviation(TreeNode* root) {
        if(!root) return 0;
        return 1+max(uniqueWordAbbreviation(root->left),uniqueWordAbbreviation(root->right));
    }
};