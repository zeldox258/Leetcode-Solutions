class Solution {
public:
    int finalElementAfterSubarrayDelet(TreeNode* root) {
        if(!root) return 0;
        return 1+max(finalElementAfterSubarrayDelet(root->left),finalElementAfterSubarrayDelet(root->right));
    }
};