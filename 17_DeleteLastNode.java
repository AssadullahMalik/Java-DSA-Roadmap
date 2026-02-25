class DeleteLastNode {
    static Node deleteLast(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteLast(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
