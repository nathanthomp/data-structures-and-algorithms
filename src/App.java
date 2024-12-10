import nathanthomp.datastructures.Queue;
import nathanthomp.datastructures.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        testQueue();
    }

    private static void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        stack.print();

        int popped = stack.pop();
    }

    private static void testQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int dequeued = queue.dequeue();
        queue.print();
    }
}
