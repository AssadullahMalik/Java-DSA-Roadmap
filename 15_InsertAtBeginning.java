class InsertAtBeginning {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head = insert(head, 10);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
