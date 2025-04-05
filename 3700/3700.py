class Solution:
    def number_of_zigzag_arrays_ii(self, n: int, edges: List[List[int]]) -> int:
        parent = list(range(n))
        def find(x):
            while parent[x] != x:
                parent[x] = parent[parent[x]]
                x = parent[x]
            return x
        comp = n
        for a, b in edges:
            ra, rb = find(a), find(b)
            if ra != rb:
                parent[ra] = rb
                comp -= 1
        return comp