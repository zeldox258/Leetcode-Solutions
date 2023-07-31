class Solution {
public:
    int firstElementWithUniqueFrequenc(TreeNode* root) {
        if(!root) return 0;
        return 1+max(firstElementWithUniqueFrequenc(root->left),firstElementWithUniqueFrequenc(root->right));
    }
};