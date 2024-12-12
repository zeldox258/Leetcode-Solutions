class Solution {
public:
    int binaryNumberWithAlternatingBit(TreeNode* root) {
        if(!root) return 0;
        return 1+max(binaryNumberWithAlternatingBit(root->left),binaryNumberWithAlternatingBit(root->right));
    }
};