import unittest

from solution_1675 import Solution1675


class Solution1675TestCase(unittest.TestCase):
    def test_basic_example(self):
        solution = Solution1675()

        nums = [1, 2, 3, 4]
        expected_result = 1
        actual_result = solution.minimumDeviation(nums)

        self.assertEqual(actual_result, expected_result)

    def test_basic_example2(self):
        solution = Solution1675()

        nums = [4, 1, 5, 20, 3]
        expected_result = 3
        actual_result = solution.minimumDeviation(nums)

        self.assertEqual(actual_result, expected_result)


if __name__ == '__main__':
    unittest.main()
