class Solution {
public:
    int largestEvenNumber(TreeNode* root) {
        if(!root) return 0;
        return 1+max(largestEvenNumber(root->left),largestEvenNumber(root->right));
    }
};