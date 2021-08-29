package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionOfTwoLinkedListsTest {
    @Test
    void givenTwoLLReturnCommonNode() {
        ListNode commonNode = new ListNode(8);
        ListNode headA;
        headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = commonNode;
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB;
        headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = commonNode;
        headB.next.next.next.next = new ListNode(4);
        headB.next.next.next.next.next = new ListNode(2);

        assertEquals(commonNode, IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB));
    }
}