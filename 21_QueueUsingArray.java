class QueueUsingArray {
    int[] queue = new int[5];
    int front = 0, rear = 0;

    void enqueue(int data) {
        if (rear == queue.length) return;
        queue[rear++] = data;
    }

    int dequeue() {
        if (front == rear) return -1;
        return queue[front++];
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
    }
}
