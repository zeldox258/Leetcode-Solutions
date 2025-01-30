class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n + 1; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int current = edge[0];
            int next = edge[1];
            graph.get(current).add(next);
            graph.get(next).add(current);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int start = 1; start <= n; start++){
            int d = 0;
            int smallestId = Integer.MAX_VALUE;
            int[] level = new int[n + 1];

            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(start);
            level[start] = 1;

            while(!queue.isEmpty()){
                d++;
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    int current = queue.poll();
                    smallestId = Math.min(smallestId, current);
                    for(int next : graph.get(current)){
                        if(level[next] == 0){
                            level[next] = d + 1;
                            queue.offer(next);
                        }
                        else if(level[next] == d){
                            return -1;
                        }
                    }
                }
            }
            //if(map.get(smallestId) == nul)
            int distance = map.containsKey(smallestId) ? Math.max(d, map.get(smallestId)) : d;
            map.put(smallestId, distance);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            result += entry.getValue();
        }
        return result;
    }
}