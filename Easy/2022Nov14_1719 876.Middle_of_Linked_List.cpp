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
    ListNode* middleNode(ListNode* head) {
        //initalize variables
        ListNode* current = head;
        int length = 0;
        
        //find length of list
        bool truth = true;
        while(truth) {
            if(current->next != nullptr) { current = current->next; length++; } else { truth = false; }
        }
        
        //navigate to middle of list
        current = head;
        for(int i = 0; i < length/2+length%2; i++) { current = current->next; }
        //return middle of list
        return current;
    } //end middleNode() function
}; //end class