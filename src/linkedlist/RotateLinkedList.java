package linkedlist;

public class RotateLinkedList {
    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    private void printList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("");
    }

    private void rotate(int k) {
        ListNode current = head;
        int count = 1;

        if (k == 0)
            return;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if(current == null)
            return;

        ListNode kthNode = current;

        while(current.next != null) {
            current = current.next;
        }

        current.next = head;

        head = kthNode.next;

        kthNode.next = null;

    }

    public static void main(String args[]) {
        RotateLinkedList obj = new RotateLinkedList();

        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        System.out.println("Before rotation : ");
        obj.printList();

        obj.rotate(2);

        System.out.println("After rotation : ");
        obj.printList();
    }

}
