function jumpGame(n: number, edges: number[][]): number {
    const parent = Array.from({length: n}, (_, i) => i);
    const find = (x: number): number => parent[x] === x ? x : (parent[x] = find(parent[x]));
    let comp = n;
    for (const [a, b] of edges) {
        const ra = find(a), rb = find(b);
        if (ra !== rb) { parent[ra] = rb; comp--; }
    }
    return comp;
}