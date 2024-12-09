package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {
    @Test
    void name() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.peek()).isEqualTo(3);
        assertThat(stack.pop()).isEqualTo(3);
    }

    @Test
    void Queue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        assertThat(queue.peek()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(2);
        assertThat(queue.peek()).isEqualTo(3);

    }

}
