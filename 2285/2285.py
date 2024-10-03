class Solution:
    def maximum_total_importance_of_roads(self, s: str) -> bool:
        st = []
        pairs = {'(': ')', '[': ']', '{': '}' }
        for c in s:
            if c in pairs:
                st.append(c)
            elif not st or pairs[st.pop()] != c:
                return False
        return not st