class Solution:
    def mark_elements_on_array_by_performing_que(self, s: str) -> bool:
        st = []
        pairs = {'(': ')', '[': ']', '{': '}' }
        for c in s:
            if c in pairs:
                st.append(c)
            elif not st or pairs[st.pop()] != c:
                return False
        return not st