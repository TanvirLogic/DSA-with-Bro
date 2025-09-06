import java.util.Queue;
import java.util.LinkedList;

public class third_class {
    public static void main(String[] args) {
        // ******************************************************
        // Queue = FIFO data structure. First-In First-Out (ex. A line of people)
        // A collection designed for holding elements prior to processing
        // Linear data structure
        //
        // add = enqueue, offer()
        // remove = dequeue, poll()
        // watch the head = peek()
        // ******************************************************

        Queue<String> queue = new LinkedList<String>(); // Queue is mainly an interface

        // LinkedList and PriorityQueue Extends it

        queue.offer("Tanvir");
        queue.offer("Liza");
        queue.offer("Bro");
        queue.offer("Code");
        // System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Tanvir")); // Returns True

        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); // All gone

        // queue.element(); // It causes Exception

        System.out.println(queue);

        // Also Queue Class extends Collection class -> Queue exteds Collection

        // Where are queues useful?
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're
        // pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in Linkedlists, PriorityQueues, Breadth-first search

    }
}