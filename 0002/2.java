class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*int a = length(l1);
        int b = length(l2);*/
        int length = length(l1,l2);
        int[] array = new int[length+1];
        int i =0;
        int hand = 0;
        while(l1 !=null || l2 !=null){
            if(l1 == null && l2 !=null){
                int temp = l2.val + hand--;
                array[i++] = temp %10;
                hand = temp /10;
                l2 = l2.next;
            }
            else if(l2 == null && l1 !=null){
                int temp = l1.val + hand--;
                array[i++] = temp %10;
                hand = temp /10;
                l1 = l1.next;
            }
            else{
                int temp = l2.val + hand-- + l1.val;
                array[i++] = temp %10;
                hand = temp /10;
                l2 = l2.next;
                l1 = l1.next;
            }
        }
        array[i] = hand;
        ListNode result = new ListNode(array[0]);
        ListNode carry = result;
        int l = array.length;
        for(i = 1;i<l;i++){
            if(i == l - 1 && array[i] == 0) break;
            ListNode tt = new ListNode(array[i]);
            carry.next = tt;
            carry = carry.next;
        }
        return result;
        
    }
    int length(ListNode root1,ListNode root2){
        int result = 0;
        while(root1 !=null || root2 !=null){
            result++;
            if(root1 !=null)root1 = root1.next;
            if(root2 !=null)root2 = root2.next;
        }
        return result;
    }
}