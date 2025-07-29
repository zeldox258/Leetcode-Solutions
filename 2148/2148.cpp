class Solution {
public:
    int countElementsWithStrictlySmall(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countElementsWithStrictlySmall(root->left),countElementsWithStrictlySmall(root->right));
    }
};