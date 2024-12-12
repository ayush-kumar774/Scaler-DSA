package Lecture21LinkedListIntroductionAndBasicProblems;

public class ListNode {
    int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    // Method to add a node at the end of the list
    public static ListNode add(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
    }

    // Method to display the list
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete the first occurrence of an element
    public static ListNode deleteFirst(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        // If the node to be deleted is the head node
        if (head.data == x) {
            return head.next;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.next.data == x) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }

        return head;
    }

    // Method to delete the last occurrence of an element
    public static ListNode deleteLastOccurrence(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        ListNode lastOccurrence = null;
        ListNode lastOccurrencePrev = null;
        ListNode prev = null;

        // Traverse the list to find the last occurrence of the element
        while (temp != null) {
            if (temp.data == x) {
                lastOccurrencePrev = prev;
                lastOccurrence = temp;
            }
            prev = temp;
            temp = temp.next;
        }

        // If the element is not found, return
        if (lastOccurrence == null) {
            return head;
        }

        // If the last occurrence is the head node
        if (lastOccurrence == head) {
            return head.next;
        } else {
            lastOccurrencePrev.next = lastOccurrence.next;
        }

        return head;
    }

}
