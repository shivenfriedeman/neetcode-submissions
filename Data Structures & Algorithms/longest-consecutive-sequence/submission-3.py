class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        nums.sort()

        maxS = 1 # max streak by default
        curr = 1 # current streak

        #constantly comparing current w one behind
        for i in range(len(nums) - 1):
            # if duplicate, go to next number in list
            if nums[i] == nums[i+1]: 
                continue
            # if next number is one greater than current, add to streak
            # otherwise reset streak
            if nums[i] + 1 == nums[i + 1]:
                curr += 1
                if curr > maxS:
                    maxS = curr
            else: 
                curr = 1
            

        return maxS