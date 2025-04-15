
import java.util.*;
class Solution {
    ListNode head; Random rand=new Random();
    public Solution(ListNode head){this.head=head;}
    public int getRandom(){
        int res=head.val; ListNode cur=head.next; int i=2;
        while(cur!=null){if(rand.nextInt(i)==0)res=cur.val;cur=cur.next;i++;}
        return res;
    }
}
