package Lecture21LinkedListIntroductionAndBasicProblems.Assignment;

import Lecture21LinkedListIntroductionAndBasicProblems.ListNode;

public class DeleteInLinkedList {
    public static void main(String[] args) {

    }
    private static ListNode delete(ListNode head, int B) {
        if (head == null) {
            return null;
        }

        if (B == 0) {
            return head.next;
        }

        ListNode curr = head;
        for (int i = 0; i < B - 1; i++) {
            if (curr == null || curr.next == null) {
                return head;
            }
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }
}

