package Lecture22LinkedListBasicProblems.Assignment;

// Definition for singly-linked list with a random pointer
class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

public class CopyList {
    public static RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode current = head;
        while (current != null) {
            RandomListNode copy = new RandomListNode(current.label);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        current = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode copyCurrent = dummy;
        while (current != null) {
            copyCurrent.next = current.next;
            copyCurrent = copyCurrent.next;
            current.next = current.next.next;
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node3;
        node2.random = node1;
        node3.random = node4;
        node4.random = node2;

        System.out.println("Original list:");
        printList(node1);

        RandomListNode copiedList = copyRandomList(node1);

        System.out.println("\nCopied list:");
        printList(copiedList);
    }

    public static void printList(RandomListNode head) {
        RandomListNode current = head;
        while (current != null) {
            System.out.print("Node: " + current.label);
            if (current.random != null) {
                System.out.print(", Random points to: " + current.random.label);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            current = current.next;
        }
    }
}
