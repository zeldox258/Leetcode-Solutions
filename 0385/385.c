int parent[10001];
int find(int x) {
    if (parent[x] != x) parent[x] = find(parent[x]);
    return parent[x];
}
int miniParser(int n, int** edges, int edgesSize, int* edgesColSize) {
    for (int i = 0; i < n; i++) parent[i] = i;
    int comp = n;
    for (int i = 0; i < edgesSize; i++) {
        int a = find(edges[i][0]), b = find(edges[i][1]);
        if (a != b) { parent[a] = b; comp--; }
    }
    return comp;
}