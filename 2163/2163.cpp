class Solution {
public:
    int minimumDifferenceInSumsAfterRe(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumDifferenceInSumsAfterRe(root->left),minimumDifferenceInSumsAfterRe(root->right));
    }
};