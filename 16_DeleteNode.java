class DeleteNode {
    static Node delete(Node head, int key) {
        if (head == null) return null;
        if (head.data == key) return head.next;

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = delete(head, 20);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

