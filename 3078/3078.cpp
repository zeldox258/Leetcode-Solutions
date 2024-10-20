class Solution {
public:
    int matchAlphanumericalPatternInMa(TreeNode* root) {
        if(!root) return 0;
        return 1+max(matchAlphanumericalPatternInMa(root->left),matchAlphanumericalPatternInMa(root->right));
    }
};