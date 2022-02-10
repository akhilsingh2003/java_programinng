class insertion_cir_linkedlist {

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node t = new Node();

        t.data = data;
        last = t;

        last.next = last;

        return last;
    }

    ;

    static Node addBegin(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node t = new Node();

        t.data = data;
        t.next = last.next;
        last.next = t;

        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node t = new Node();

        t.data = data;
        t.next = last.next;
        last.next = t;
        last = t;

        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node t, p;
        p = last.next;
        do {
            if (p.data == item) {
                t = new Node();
                t.data = data;
                t.next = p.next;
                p.next = t;

                if (p == last)
                    last = t;
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " not found in the list.");
        return last;

    }

    static void traverse(Node last) {
        Node p;

        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        p = last.next;

        do {
            System.out.print(p.data + " ");
            p = p.next;

        }
        while (p != last.next);

    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addBegin(last, 4);
        last = addBegin(last, 2);
        last = addEnd(last, 8);
        last = addEnd(last, 12);
        last = addAfter(last, 10, 8);

        traverse(last);
    }

    static class Node {
        int data;
        Node next;
    }
}

