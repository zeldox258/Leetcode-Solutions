class Solution:
    def find_the_first_player_to_win_k_games_in_(self, n: int, edges: List[List[int]]) -> int:
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