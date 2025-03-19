class Solution {
    public int countPaths(int n, int[][] roads) {
        
        int[][] edge_matrix = new int[n][n];
        long[] distance = new long[n];
        int[] visited = new int[n];
        int[] ways = new int[n];
        int visited_count = 0;
    
        Arrays.fill(distance,Long.MAX_VALUE);
        distance[0] = 0;
        ways[0] = 1;

        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    edge_matrix[i][j] = -1;
                if(i==j)
                    edge_matrix[i][j] = 0; 
            }
        }

        for(int[] road:roads){
            edge_matrix[road[0]][road[1]] = road[2];
            edge_matrix[road[1]][road[0]] = road[2];
        }

        while(visited_count<n){
        

            int min_index = -1;
            long min_distance = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                
                if(visited[i]==0 && distance[i] < min_distance){
                    min_distance = distance[i];
                    min_index = i;
                }
            }

            visited[min_index] = 1;
            visited_count++;

            for(int i=0;i<n;i++){
                if(min_index!=i && edge_matrix[min_index][i]!=-1 && (min_distance + edge_matrix[min_index][i]) <= distance[i]){
                    if((min_distance + edge_matrix[min_index][i]) == distance[i])
                        ways[i] = (ways[i] + ways[min_index]) % 1000000007;
                    else
                        ways[i] = (ways[min_index]) % 1000000007;
                    distance[i] = min_distance + (long)edge_matrix[min_index][i];
                }
            }

        }
    
        return ways[n-1];
        
    }
}