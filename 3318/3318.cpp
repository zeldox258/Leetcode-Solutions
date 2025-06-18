class Solution {
public:
    int findXsumOfAllKlongSubarraysI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findXsumOfAllKlongSubarraysI(root->left),findXsumOfAllKlongSubarraysI(root->right));
    }
};