package juja.webinar.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque deque = new LinkedList();
        demoStack(deque);
        if (true) return;
        deque.add("1");
        deque.offer("Hello");
        deque.add(3);
        System.err.println(deque);
        System.err.println("Peek " + deque.peek());
        System.err.println(deque);
        System.err.println("Poll " + deque.poll());
        System.err.println(deque);
        System.err.println("Element " + deque.element());
        System.err.println(deque);
        System.err.println("Remove " + deque.remove());
        System.err.println(deque);
        deque.remove();
        System.err.println(deque.poll());
        System.err.println(deque.element());
    }

    public static void demoStack(Deque deque) {
        deque.addFirst("2");
        deque.offerFirst("Buy");
        deque.addFirst(5);
        System.err.println(deque);
        System.err.println("PeekFirst " + deque.peekFirst());
        System.err.println(deque);
        System.err.println("Poll First " + deque.pollFirst());
        System.err.println(deque);
        System.err.println("Get First " + deque.getFirst());
        System.err.println("Remove first " + deque.removeFirst());
        System.err.println(deque);
        System.err.println("Remove First " + deque.removeFirst());
        System.err.println(deque.getFirst());

        deque.removeFirst();
        System.err.println("finished demo stack");
    }
}