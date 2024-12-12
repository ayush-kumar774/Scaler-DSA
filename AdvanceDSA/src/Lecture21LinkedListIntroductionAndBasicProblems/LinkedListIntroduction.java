package Lecture21LinkedListIntroductionAndBasicProblems;

public class LinkedListIntroduction {
    public static void main(String[] args) {
        ListNode head = null;

        head = ListNode.add(head, 1);
        head = ListNode.add(head, 2);
        head = ListNode.add(head, 3);
        head = ListNode.add(head, 2);
        head = ListNode.add(head, 4);

        System.out.println("Original list:");
        ListNode.display(head); // Output: 1 -> 2 -> 3 -> 2 -> 4 -> null

        head = deleteFirst(head, 2);
        System.out.println("After deleting the first occurrence of 2:");
        ListNode.display(head); // Output: 1 -> 3 -> 2 -> 4 -> null

        head = ListNode.deleteLastOccurrence(head, 2);
        System.out.println("After deleting the last occurrence of 2:");
        ListNode.display(head); // Output: 1 -> 3 -> 4 -> null

        head = reverseLinkedList(head);
        System.out.println("Reversed linked list: ");
        ListNode.display(head);
    }


    private static ListNode deleteFirst(ListNode head, int x) {
        if (head == null) return null;
        if (head.data == x) return head.next;

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return null;
    }

//    private static Node deleteAllOccurances(Node head, int X) {
//
//    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }

    /*
        1. Basics of Linked List
        2. Accessing elements
        3. Searching for value
        4. Insertion in LL
        5. Deletion in LL
        6. Reverse a Linked List
        7. Check if palindrome
     */
}
