class Solution {
public:
    ListNode* joinTwoArraysById(ListNode* head) {
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