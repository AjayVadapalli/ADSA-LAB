class Queue {
    private int[] queueArray;
    private int front, rear, capacity;

    // Constructor to initialize the queue
    public Queue(int size) {
        queueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        queueArray[++rear] = value;
        System.out.println(value + " enqueued into the queue.");
    }

    // Method to remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
        int dequeuedValue = queueArray[front];
        // Shift all elements to the left to maintain the order
        for (int i = 0; i < rear; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        rear--;
        return dequeuedValue;
    }

    // Method to return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Method to print all elements of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queueArray[i]);
        }
    }

    // Main method to test the Queue class
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue with capacity of 5
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element is: " + queue.dequeue());
        queue.printQueue();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
