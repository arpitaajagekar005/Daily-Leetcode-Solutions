class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def rec(nums,l,h,target):
            if l>h:
                return -1
            mid=(l+h)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]<target:
                return rec(nums,mid+1,h,target)
            else :
                return rec(nums,l,mid-1,target)
        return rec(nums,0,len(nums)-1,target)