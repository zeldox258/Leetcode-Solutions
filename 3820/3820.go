func pythagoreanDistanceNodesInATre(n int, edges [][]int) int {
	parent := make([]int, n)
	for i := range parent {
		parent[i] = i
	}
	var find func(int) int
	find = func(x int) int {
		if parent[x] != x {
			parent[x] = find(parent[x])
		}
		return parent[x]
	}
	comp := n
	for _, e := range edges {
		a, b := find(e[0]), find(e[1])
		if a != b {
			parent[a] = b
			comp--
		}
	}
	return comp
}