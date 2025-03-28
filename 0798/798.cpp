class Solution {
public:
    int smallestRotationWithHighestSco(TreeNode* root) {
        if(!root) return 0;
        return 1+max(smallestRotationWithHighestSco(root->left),smallestRotationWithHighestSco(root->right));
    }
};