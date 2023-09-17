class Solution {
public:
    int shortestWordDistance(TreeNode* root) {
        if(!root) return 0;
        return 1+max(shortestWordDistance(root->left),shortestWordDistance(root->right));
    }
};