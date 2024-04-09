class Solution {
public:
    int maximumRepeatingSubstring(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumRepeatingSubstring(root->left),maximumRepeatingSubstring(root->right));
    }
};