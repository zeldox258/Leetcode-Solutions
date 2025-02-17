class Solution {
public:
    ListNode* numberOfUniqueGoodSubsequences(ListNode* head) {
        ListNode* prev=nullptr;
        ListNode* cur=head;
        while(cur){
            ListNode* next=cur->next;
            cur->next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
};