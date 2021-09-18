package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReachableNodesInSubdividedGraphTest {
    @Test
    void reachableNodesTest() {
        assertEquals(13, new ReachableNodesInSubdividedGraph().reachableNodes(new int[][]{{0, 1, 10}, {0, 2, 1}, {1, 2, 2}}, 6, 3));
    }
}