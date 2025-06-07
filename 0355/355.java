
import java.util.*;
class Twitter {
    Map<Integer,Set<Integer>> following=new HashMap<>();
    Map<Integer,List<int[]>> tweets=new HashMap<>();
    int ts=0;
    public void postTweet(int userId, int tweetId) { tweets.computeIfAbsent(userId,k->new ArrayList<>()).add(new int[]{ts++,tweetId}); }
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        Set<Integer> users=new HashSet<>(following.getOrDefault(userId,new HashSet<>())); users.add(userId);
        for (int u:users) { List<int[]> t=tweets.getOrDefault(u,new ArrayList<>()); for (int i=t.size()-1;i>=Math.max(0,t.size()-10);i--) pq.offer(t.get(i)); }
        List<Integer> res=new ArrayList<>();
        while (!pq.isEmpty()&&res.size()<10) res.add(pq.poll()[1]);
        return res;
    }
    public void follow(int f,int e){following.computeIfAbsent(f,k->new HashSet<>()).add(e);}
    public void unfollow(int f,int e){following.getOrDefault(f,new HashSet<>()).remove(e);}
}
