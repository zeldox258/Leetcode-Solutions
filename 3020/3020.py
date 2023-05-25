class Solution:
    def find_the_maximum_number_of_elements_in_s(self, s: str) -> bool:
        st = []
        pairs = {'(': ')', '[': ']', '{': '}' }
        for c in s:
            if c in pairs:
                st.append(c)
            elif not st or pairs[st.pop()] != c:
                return False
        return not st