class Solution {
public:
    int findTheMaximumNumberOfFruitsCo(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findTheMaximumNumberOfFruitsCo(root->left),findTheMaximumNumberOfFruitsCo(root->right));
    }
};