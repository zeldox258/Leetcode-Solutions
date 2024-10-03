class Solution {
public:
    int minimumDistanceToTheTargetElem(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumDistanceToTheTargetElem(root->left),minimumDistanceToTheTargetElem(root->right));
    }
};