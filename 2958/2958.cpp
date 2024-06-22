class Solution {
public:
    int lengthOfLongestSubarrayWithAtM(TreeNode* root) {
        if(!root) return 0;
        return 1+max(lengthOfLongestSubarrayWithAtM(root->left),lengthOfLongestSubarrayWithAtM(root->right));
    }
};