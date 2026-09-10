/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {

        ListNode* temp;
        while(head!=NULL && head->val==val){
            temp=head;
            head=head->next;
            delete temp;
        }

        if(head==NULL) return NULL;

        ListNode* current = head;
        while(current!=NULL && current->next != NULL){
            if(current->next->val == val){
                temp=current->next;
                current->next = current->next->next;
                delete temp;
            }else{
                current = current->next;
            }
        }
        return head;
    }
};