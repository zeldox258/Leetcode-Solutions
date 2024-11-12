class Solution {
public:
    int equalTreePartition(TreeNode* root) {
        if(!root) return 0;
        return 1+max(equalTreePartition(root->left),equalTreePartition(root->right));
    }
};