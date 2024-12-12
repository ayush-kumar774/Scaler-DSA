package Lecture22LinkedListBasicProblems.Assignment;

import Lecture21LinkedListIntroductionAndBasicProblems.ListNode;

public class InsertInLinkedList {
    public static void main(String[] args) {
        ListNode head = null;
        head = ListNode.add(head, 1);
        head = ListNode.add(head, 2);
        head = ListNode.add(head, 3);
        head = ListNode.add(head, 2);
        head = ListNode.add(head, 4);
        int b = 6 ;
        int c = 5;
        head = solve(head, b, c);
        ListNode.display(head);
    }

    public static ListNode solve(ListNode A, int B, int C) {
        ListNode temp = new ListNode(B);

        if (C == 0) {
            temp.next = A;
            return temp;
        }

        if ( A == null) {
            return temp;
        }

        ListNode head = A;
        ListNode prev = null;
        int i = 0;

        while (i < C && head != null) {
            prev = head;
            head = head.next;
            i++;
        }

        if (head == null) {
            prev.next = temp;
        } else {
            prev.next = temp;
            temp.next = head;
        }
        return A;
    }
}

