class Solution {
public:
    int minimumDistanceBetweenBstNodes(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumDistanceBetweenBstNodes(root->left),minimumDistanceBetweenBstNodes(root->right));
    }
};