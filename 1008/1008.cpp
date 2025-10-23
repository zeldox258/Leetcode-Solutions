class Solution {
public:
    int constructBinarySearchTreeFromP(TreeNode* root) {
        if(!root) return 0;
        return 1+max(constructBinarySearchTreeFromP(root->left),constructBinarySearchTreeFromP(root->right));
    }
};