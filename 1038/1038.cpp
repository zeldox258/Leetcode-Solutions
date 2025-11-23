class Solution {
public:
    int binarySearchTreeToGreaterSumTr(TreeNode* root) {
        if(!root) return 0;
        return 1+max(binarySearchTreeToGreaterSumTr(root->left),binarySearchTreeToGreaterSumTr(root->right));
    }
};