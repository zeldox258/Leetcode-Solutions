class Solution {
public:
    int countItemsMatchingARule(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countItemsMatchingARule(root->left),countItemsMatchingARule(root->right));
    }
};