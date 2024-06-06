class Solution {
public:
    int catAndMouseIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(catAndMouseIi(root->left),catAndMouseIi(root->right));
    }
};