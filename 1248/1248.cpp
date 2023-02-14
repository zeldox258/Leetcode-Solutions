class Solution {
public:
    int countNumberOfNiceSubarrays(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countNumberOfNiceSubarrays(root->left),countNumberOfNiceSubarrays(root->right));
    }
};