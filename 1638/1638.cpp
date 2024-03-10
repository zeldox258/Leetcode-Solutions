class Solution {
public:
    int countSubstringsThatDifferByOne(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countSubstringsThatDifferByOne(root->left),countSubstringsThatDifferByOne(root->right));
    }
};