public class queueA<E> implements queueI<E> {
    private E[] queue;
    private int front, size;

    // Default constructor
    queueA() {
        this(DEFAULT_CAPACITY);
    }

    queueA(int cap) {
        this.queue = (E[]) new Object[cap];
        front = size = 0;
    }

    @Override
    public void enqueue(E obj) {

        if (this.isFull()) {
            System.out.println("Queue is full");
            return;
        }

        int available = (front + size) % queue.length;
        queue[available] = obj;

        size++;
    }

    @Override
    public E dequeue() {

        if (this.isEmpty()) {
            return null;
        }

        E tmp = queue[front];
        queue[front] = null;
        front = ++front % queue.length;

        size--;

        return tmp;
    }

    @Override
    public E peek() {
        return queue[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == queue.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < queue.length; i++) {
            str += queue[i] + ", ";
        }

        return str;
    }
}
