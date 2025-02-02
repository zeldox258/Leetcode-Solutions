class Solution {
public:
    int theNumberOfWaysToMakeTheSum(TreeNode* root) {
        if(!root) return 0;
        return 1+max(theNumberOfWaysToMakeTheSum(root->left),theNumberOfWaysToMakeTheSum(root->right));
    }
};