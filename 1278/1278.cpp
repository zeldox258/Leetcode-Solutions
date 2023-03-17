class Solution {
public:
    int palindromePartitioningIii(TreeNode* root) {
        if(!root) return 0;
        return 1+max(palindromePartitioningIii(root->left),palindromePartitioningIii(root->right));
    }
};