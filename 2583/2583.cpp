class Solution {
public:
    int kthLargestSumInABinaryTree(TreeNode* root) {
        if(!root) return 0;
        return 1+max(kthLargestSumInABinaryTree(root->left),kthLargestSumInABinaryTree(root->right));
    }
};