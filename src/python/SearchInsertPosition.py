# 35. Search Insert Position
# Given a sorted array of distinct integers and a target value, return the index if the target is found.
# If not, return the index where it would be if it were inserted in order.
# You must write an algorithm with O(log n) runtime complexity.

import unittest


def search_insert(nums, target):
    if target in nums:
        return nums.index(target)
    else:
        for i in range(len(nums)):
            if nums[i] > target:
                return i
        return len(nums)


class TestSearchInsert(unittest.TestCase):
    def test_search_insert(self):
        self.assertEqual(search_insert([1, 3, 5, 6], 5), 2)
        self.assertEqual(search_insert([1, 3, 5, 6], 2), 1)
        self.assertEqual(search_insert([1, 3, 5, 6], 7), 4)
        self.assertEqual(search_insert([], 5), 0)
        self.assertEqual(search_insert([3, 5, 6], 1), 0)
        self.assertEqual(search_insert([3, 5, 6], 10), 3)


if __name__ == '__main__':
    unittest.main()

# The index of 5 in the list [1, 3, 5, 6] is 2.
# The index where 2 should be inserted in the list [1, 3, 5, 6] is 1.
# The index where 7 should be inserted in the list [1, 3, 5, 6] is 4.
# The index where 0 should be inserted in the list [1, 3, 5, 6] is 0.
