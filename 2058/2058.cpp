class Solution {
public:
    int findTheMinimumAndMaximumNumber(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheMinimumAndMaximumNumber(root->left),findTheMinimumAndMaximumNumber(root->right));
    }
};