class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, num in enumerate(nums):
            try:
                return [d[target - num], i]
            except KeyError:
                d[num] = i

        