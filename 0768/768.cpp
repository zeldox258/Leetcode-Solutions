class Solution {
public:
    int maxChunksToMakeSortedIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maxChunksToMakeSortedIi(root->left),maxChunksToMakeSortedIi(root->right));
    }
};