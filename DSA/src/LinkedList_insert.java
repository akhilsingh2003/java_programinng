class LinkedList_insert {
    Node head;

    LinkedList_insert() {
        head = null;
    }

    public static void main(String[] args) {
        LinkedList_insert mylst = new LinkedList_insert();
        mylst.insert_at(233, 1);
        mylst.insert_at(23, 2);
        mylst.insert_at(97, 3);
        mylst.insert_at(33, 4);
        mylst.PrintList();


    }

    void insert_at(int newElement, int position) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null;

        if (position < 1) {
            System.out.println("position should be greater or equal to 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node temp = new Node();
            temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }

            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("The previous node is null.");
            }
        }
    }

    void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if (temp != null) {
            System.out.print("The list is : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }
}


class Node {
    int data;
    Node next;
};
