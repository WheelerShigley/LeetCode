/**
 *  struct ListNode {
 *      int val;
 *      ListNode *next;
 *      ListNode() : val(0), next(nullptr) {}
 *      ListNode(int x) : val(x), next(nullptr) {}
 *      ListNode(int x, ListNode *next) : val(x), next(next) {}
 *  };
 */

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        bool carry = false;
        ListNode* result = new ListNode();
        ListNode* current = result;
        int currentValue = 0;

        while(l1 != nullptr || l2 != nullptr || carry) {

            currentValue = (carry ? 1 : 0);
            if(l1 != nullptr) {
                currentValue += l1->val;

                l1 = l1->next;
            }
            if(l2 != nullptr) {
                currentValue += l2->val;

                l2 = l2->next;
            }
            carry = (10 <= currentValue);

            current->next = new ListNode(currentValue%10);
            current = current->next;
        }
        result = result->next;

        return result;
    }
};