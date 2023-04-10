class Solution:
    def find_mode_in_binary_search_tree(self, s: str) -> int:
        seen = set()
        l = res = 0
        for r, c in enumerate(s):
            while c in seen:
                seen.remove(s[l])
                l += 1
            seen.add(c)
            res = max(res, r - l + 1)
        return res