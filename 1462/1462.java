class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int[] indegree = new int[numCourses];

        // stores a set of preRequisites for each course.
        List<Set<Integer>> preReqs = new ArrayList<>();

        // adjList
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<numCourses;i++) {
            preReqs.add(new HashSet<>());
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++) {
            indegree[prerequisites[i][1]]++;
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int neighbour: graph.get(curr)) {
                // current course is a preRequisite
                preReqs.get(neighbour).add(curr);

                // all preRequisites of current course are also preRequisites
                for(int p: preReqs.get(curr)) {
                    preReqs.get(neighbour).add(p);
                }

                indegree[neighbour]--;
                if(indegree[neighbour] == 0) {
                    q.add(neighbour);
                }

            }
        }

        List<Boolean> ans = new ArrayList<>();
        for(int[] query: queries) {
            ans.add(preReqs.get(query[1]).contains(query[0]));
        }
        return ans;
    }
}