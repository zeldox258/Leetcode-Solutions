class Solution {
public:
    int minimumAmountOfDamageDealtToBo(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumAmountOfDamageDealtToBo(root->left),minimumAmountOfDamageDealtToBo(root->right));
    }
};