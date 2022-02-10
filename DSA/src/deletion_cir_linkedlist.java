class deletion_cir_linkedlist {

    static Node push(Node head_ref, int data) {

        Node p = new Node();
        p.data = data;
        p.next = head_ref;


        if (head_ref != null) {

            Node obj = head_ref;
            while (obj.next != head_ref)
                obj = obj.next;
            obj.next = p;
        } else
            p.next = p;

        head_ref = p;
        return head_ref;
    }

    ;

    static void printList(Node head) {
        Node obj = head;
        if (head != null) {
            do {
                System.out.printf("%d ", obj.data);
                obj = obj.next;
            } while (obj != head);
        }

        System.out.println();
    }

    static Node deleteNode(Node head, int key) {
        if (head == null)
            return null;


        Node curr = head, prev = new Node();
        while (curr.data != key) {
            if (curr.next == head) {
                System.out.println("\nGiven node is not present  in the list");
                break;
            }

            prev = curr;
            curr = curr.next;
        }

        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }

        if (curr == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = curr.next;
            prev.next = head;
        } else if (curr.next == head) {
            prev.next = head;
        } else {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String args[]) {

        Node head = null;

        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);

        System.out.printf("List Before Deletion: ");
        printList(head);

        head = deleteNode(head, 7);

        System.out.printf("List After Deletion: ");
        printList(head);
    }

    static class Node {
        int data;
        Node next;
    }
}

