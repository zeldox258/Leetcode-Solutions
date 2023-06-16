function findXsumOfAllKlongSubarraysI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findXsumOfAllKlongSubarraysI(root.left), findXsumOfAllKlongSubarraysI(root.right));
}