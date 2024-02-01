class Solution {
public:
    int kthSmallestElementInASortedMat(TreeNode* root) {
        if(!root) return 0;
        return 1+max(kthSmallestElementInASortedMat(root->left),kthSmallestElementInASortedMat(root->right));
    }
};