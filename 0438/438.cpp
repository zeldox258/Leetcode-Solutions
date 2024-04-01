class Solution {
public:
    int findAllAnagramsInAString(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findAllAnagramsInAString(root->left),findAllAnagramsInAString(root->right));
    }
};