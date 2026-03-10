class Solution {
public:
    int findMaximumAreaOfATriangle(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findMaximumAreaOfATriangle(root->left),findMaximumAreaOfATriangle(root->right));
    }
};