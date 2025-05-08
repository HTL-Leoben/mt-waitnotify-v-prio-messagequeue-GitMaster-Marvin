package at.htlle.pos4.prio_messagequeue;

import java.util.Random;

public class Producer extends Thread {
    private final PriorityMessageQueue queue;
    private final Random rand = new Random();

    public Producer(String name, PriorityMessageQueue queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int count = 1;
            while (true) {
                boolean isPriority = rand.nextBoolean();
                String content = "Message " + count++;
                Message msg = new Message(isPriority, content);
                queue.sendMessage(msg);
                Thread.sleep(rand.nextInt(1000) + 500); // 0.5–1.5 Sekunden Pause
            }
        } catch (InterruptedException ignored) {}
    }
}
