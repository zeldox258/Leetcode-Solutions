class Solution {
public:
    int maxSumOfRectangleNoLargerThanK(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maxSumOfRectangleNoLargerThanK(root->left),maxSumOfRectangleNoLargerThanK(root->right));
    }
};