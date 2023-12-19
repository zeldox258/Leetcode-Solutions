class Solution {
public:
    int largestBstSubtree(TreeNode* root) {
        if(!root) return 0;
        return 1+max(largestBstSubtree(root->left),largestBstSubtree(root->right));
    }
};