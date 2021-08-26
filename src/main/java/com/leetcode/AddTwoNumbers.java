/**
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 */
package com.leetcode;

public class AddTwoNumbers {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode previous = null;
        ListNode temporary= null;
        int carry = 0, sum;
        while (l1 != null || l2 != null) {
            sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;

            temporary = new ListNode(sum);
            if (result == null) {
                result = temporary;
            } else {
                previous.next = temporary;
            }

            previous = temporary;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            temporary.next = new ListNode(carry);
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(){
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next= next;
    }
}