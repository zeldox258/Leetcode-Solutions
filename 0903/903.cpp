class Solution {
public:
    int validPermutationsForDiSequence(TreeNode* root) {
        if(!root) return 0;
        return 1+max(validPermutationsForDiSequence(root->left),validPermutationsForDiSequence(root->right));
    }
};