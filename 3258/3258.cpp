class Solution {
public:
    int countSubstringsThatSatisfyKcon(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countSubstringsThatSatisfyKcon(root->left),countSubstringsThatSatisfyKcon(root->right));
    }
};