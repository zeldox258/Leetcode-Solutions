class Solution {
public:
    int restoreTheArrayFromAdjacentPai(TreeNode* root) {
        if(!root) return 0;
        return 1+max(restoreTheArrayFromAdjacentPai(root->left),restoreTheArrayFromAdjacentPai(root->right));
    }
};