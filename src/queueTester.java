public class queueTester {

    public static void main(String[] args) {

        queueA<String> q = new queueA<>(10);

        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
    
        System.out.println(q);

        q.enqueue("D");
        q.enqueue("E");
        q.enqueue("F");

        System.out.println(q);

        String r = q.dequeue();
        System.out.println(r);

        q.dequeue();
        q.dequeue();

        System.out.println(q);

        q.enqueue("G");
        q.enqueue("H");
        q.enqueue("I");
        q.enqueue("J");
        q.enqueue("K");
        q.enqueue("L");

        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }

        System.out.println(q);

        System.out.println(q.dequeue());
        q.dequeue();
    }
}