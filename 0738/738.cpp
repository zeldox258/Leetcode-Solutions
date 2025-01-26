class Solution {
public:
    int monotoneIncreasingDigits(TreeNode* root) {
        if(!root) return 0;
        return 1+max(monotoneIncreasingDigits(root->left),monotoneIncreasingDigits(root->right));
    }
};