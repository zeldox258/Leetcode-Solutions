class Solution:
    def detect_pattern_of_length_m_repeated_k_or(self, s: str) -> int:
        seen = set()
        l = res = 0
        for r, c in enumerate(s):
            while c in seen:
                seen.remove(s[l])
                l += 1
            seen.add(c)
            res = max(res, r - l + 1)
        return res