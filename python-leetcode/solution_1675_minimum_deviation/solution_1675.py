import heapq


class Solution1675(object):
    def minimumDeviation(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # transform all odd numbers to even by multiplying by 2
        nums = sorted([x * 2 if x % 2 == 1 else x for x in nums])
        min_deviation = float('inf')
        # keep track of the current maximum value in the array
        max_val = max(nums)
        # use a heap to efficiently get the minimum value in the array
        min_heap = [(-x, x) for x in nums]
        heapq.heapify(min_heap)
        while True:
            # get the negative of the maximum value and its corresponding original value
            curr_max_neg, orig_max = heapq.heappop(min_heap)
            curr_max = -curr_max_neg
            # update the minimum deviation if needed
            min_deviation = min(min_deviation, curr_max - nums[0])
            # if the maximum value is odd, we can't increase it further
            if curr_max % 2 == 1:
                break
            # otherwise, divide it by 2 and add it back to the heap
            new_val = curr_max // 2
            nums[0] = min(nums[0], new_val)
            heapq.heappush(min_heap, (-new_val, orig_max))
        return min_deviation
