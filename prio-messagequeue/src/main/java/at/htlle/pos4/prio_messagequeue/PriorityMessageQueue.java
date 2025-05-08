package at.htlle.pos4.prio_messagequeue;

import java.util.LinkedList;

public class PriorityMessageQueue {
    private final int maxSize;
    private final LinkedList<Message> priorityQueue = new LinkedList<>();
    private final LinkedList<Message> normalQueue = new LinkedList<>();

    public PriorityMessageQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void sendMessage(Message msg)  {

    }

    public synchronized Message receiveMessage() {
        return null;
    }
}
