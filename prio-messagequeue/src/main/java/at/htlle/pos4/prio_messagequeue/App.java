package at.htlle.pos4.prio_messagequeue;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        PriorityMessageQueue queue = new PriorityMessageQueue(5); // Maximal 5 Messages in der Queue

        new Producer("Producer1", queue).start();
        new Producer("Producer2", queue).start();
        new Consumer("Consumer1", queue).start();
        new Consumer("Consumer2", queue).start();



    }
}
