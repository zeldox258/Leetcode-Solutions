class Solution {
public:
    int removeSubfoldersFromTheFilesys(TreeNode* root) {
        if(!root) return 0;
        return 1+max(removeSubfoldersFromTheFilesys(root->left),removeSubfoldersFromTheFilesys(root->right));
    }
};