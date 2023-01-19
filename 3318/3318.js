/**
 * @param {TreeNode} root
 * @return {number}
 */
var findXsumOfAllKlongSubarraysI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findXsumOfAllKlongSubarraysI(root.left), findXsumOfAllKlongSubarraysI(root.right));
};