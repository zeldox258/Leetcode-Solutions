class Solution {
public:
    int differenceBetweenMaximumAndMin(TreeNode* root) {
        if(!root) return 0;
        return 1+max(differenceBetweenMaximumAndMin(root->left),differenceBetweenMaximumAndMin(root->right));
    }
};