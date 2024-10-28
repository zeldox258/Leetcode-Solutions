class Solution {
public:
    int replaceWords(TreeNode* root) {
        if(!root) return 0;
        return 1+max(replaceWords(root->left),replaceWords(root->right));
    }
};