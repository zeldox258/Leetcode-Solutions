class Solution:
    def implement_trie_prefix_tree(self, nums: List[int], k: int) -> int:
        import heapq
        return heapq.nlargest(k, nums)[-1]