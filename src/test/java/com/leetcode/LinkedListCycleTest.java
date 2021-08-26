package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void givenLinkedListReturnHasCycle(){
        ListNode head;
        ListNode firstNode = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode fourthNode = new ListNode(-4);

        head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        assertTrue(LinkedListCycle.hasCycle(head));

        fourthNode.next = null;

        assertFalse(LinkedListCycle.hasCycle(head));
    }
}