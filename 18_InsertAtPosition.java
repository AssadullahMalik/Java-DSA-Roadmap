class InsertAtPosition {
    static Node insert(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);

        head = insert(head, 20, 1);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
