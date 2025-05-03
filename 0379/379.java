
import java.util.*;
class PhoneDirectory {
    Deque<Integer> q=new LinkedList<>(); boolean[] used;
    public PhoneDirectory(int maxNumbers) {
        used=new boolean[maxNumbers];
        for(int i=0;i<maxNumbers;i++) q.offer(i);
    }
    public int get(){if(q.isEmpty())return -1;int n=q.poll();used[n]=true;return n;}
    public boolean check(int number){return !used[number];}
    public void release(int number){if(used[number]){used[number]=false;q.offer(number);}}
}
