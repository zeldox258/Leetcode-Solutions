
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        boolean[] vis=new boolean[friends.length];
        Queue<Integer> q=new LinkedList<>();
        q.offer(id); vis[id]=true;
        for(int l=0;l<level;l++){
            int sz=q.size();
            for(int i=0;i<sz;i++){ int cur=q.poll(); for(int f:friends[cur]) if(!vis[f]){vis[f]=true;q.offer(f);} }
        }
        Map<String,Integer> cnt=new HashMap<>();
        while(!q.isEmpty()) for(String v:watchedVideos.get(q.poll())) cnt.merge(v,1,Integer::sum);
        List<String> res=new ArrayList<>(cnt.keySet());
        res.sort((a,b)->cnt.get(a)!=cnt.get(b)?cnt.get(a)-cnt.get(b):a.compareTo(b));
        return res;
    }
}
