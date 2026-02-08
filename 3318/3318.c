int findXsumOfAllKlongSubarraysI(struct TreeNode* root) {
    if (!root) return 0;
    int l = findXsumOfAllKlongSubarraysI(root->left);
    int r = findXsumOfAllKlongSubarraysI(root->right);
    return 1 + (l > r ? l : r);
}