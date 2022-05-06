/**
 * 225. Implement Stack using Queues
 */
package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        int size = queue.size() - 1;
        while (size-- > 0) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
