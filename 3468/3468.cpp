class Solution {
public:
    int findTheNumberOfCopyArrays(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheNumberOfCopyArrays(root->left),findTheNumberOfCopyArrays(root->right));
    }
};