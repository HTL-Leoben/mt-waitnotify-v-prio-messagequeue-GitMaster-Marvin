package at.htlle.pos4.prio_messagequeue;

import java.util.Random;

public class Consumer extends Thread {
    private final PriorityMessageQueue queue;
    private final Random rand = new Random();

    public Consumer(String name, PriorityMessageQueue queue) {
        super(name);
        this.queue = queue;
    }


}
