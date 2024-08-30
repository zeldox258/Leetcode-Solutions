class Solution {
public:
    int designInmemoryFileSystem(TreeNode* root) {
        if(!root) return 0;
        return 1+max(designInmemoryFileSystem(root->left),designInmemoryFileSystem(root->right));
    }
};