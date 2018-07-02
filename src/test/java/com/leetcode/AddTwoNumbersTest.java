package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {
    @Test
    void givenTwoNumbersAsLLReturnSumAsLL() {
        ListNode listOne = new ListNode(2);
        listOne.next = new ListNode(4);
        listOne.next.next = new ListNode(3);

        ListNode listTwo = new ListNode(5);
        listTwo.next = new ListNode(6);
        listTwo.next.next = new ListNode(4);

        ListNode listThree = new ListNode(7);
        listThree.next = new ListNode(5);
        listThree.next.next = new ListNode(9);
        listThree.next.next.next = new ListNode(4);
        listThree.next.next.next.next = new ListNode(6);

        ListNode listFour = new ListNode(8);
        listFour.next = new ListNode(4);

        ListNode listFive = new ListNode(1);

        ListNode listSix = new ListNode(9);
        listSix.next = new ListNode(9);

        ListNode resultOne = AddTwoNumbers.addTwoNumbers(listOne, listTwo);
        ListNode resultTwo = AddTwoNumbers.addTwoNumbers(listThree, listFour);
        ListNode resultThree = AddTwoNumbers.addTwoNumbers(listFive, listSix);

        assertEquals(7, resultOne.val);
        assertEquals(0, resultOne.next.val);
        assertEquals(8, resultOne.next.next.val);

        assertEquals(5, resultTwo.val);
        assertEquals(0, resultTwo.next.val);
        assertEquals(0, resultTwo.next.next.val);
        assertEquals(5, resultTwo.next.next.next.val);
        assertEquals(6, resultTwo.next.next.next.next.val);

        assertEquals(0, resultThree.val);
        assertEquals(0, resultThree.next.val);
        assertEquals(1, resultThree.next.next.val);
    }
}