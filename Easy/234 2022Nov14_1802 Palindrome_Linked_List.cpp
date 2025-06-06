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
    bool isPalindrome(ListNode* head) {
        //instance variables
        ListNode* current = head;
        int length = 1; //starts with header
        
        //find length of linked list
        while(current->next != nullptr) { current = current->next; length++; }
        
        //create array for comparisons later (by navigation, again)
        int values[length+1];
        current = head;
        for(int pos = 0; pos < length; pos++) {
            values[pos] = current->val;
            current = current->next;
        }
        
        //make comparisons for each potential pair, only returning false if not equal
        for(int outsides = 0; outsides < length/2 + 1; outsides++) {
            if( values[outsides] != values[length-1-outsides] ) { return false; }
        }
        
        //if no inequalities found, return true
        return true;
        
    } //end isPalindrome() function
};