class Solution {
public:
    int longestSubstringWithoutRepeati(TreeNode* root) {
        if(!root) return 0;
        return 1+max(longestSubstringWithoutRepeati(root->left),longestSubstringWithoutRepeati(root->right));
    }
};