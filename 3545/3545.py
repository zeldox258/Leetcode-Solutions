class Solution:
    def minimum_deletions_for_at_most_k_distinct(self, s: str) -> bool:
        st = []
        pairs = {'(': ')', '[': ']', '{': '}' }
        for c in s:
            if c in pairs:
                st.append(c)
            elif not st or pairs[st.pop()] != c:
                return False
        return not st