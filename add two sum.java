public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();  // Dummy node
        ListNode current = dummyHead;  // Pointer to build the list
        int carry = 0;  // Carry for addition

        while (l1 != null || l2 != null || carry != 0) {  
            int num1 = 0;
            int num2 = 0;

            if (l1 != null) {  
                num1 = l1.val;  
                l1 = l1.next;  // Move to the next node in l1
            }

            if (l2 != null) {  
                num2 = l2.val;  
                l2 = l2.next;  // Move to the next node in l2
            }

            int sum = num1 + num2 + carry;  
            carry = sum / 10;  // Extract carry for next addition
            current.next = new ListNode(sum % 10);  // Store the last digit
            current = current.next;  // Move to the next node
        }

        return dummyHead.next;  // Return the result list (excluding dummy)
    }
}
