from typing import List


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        l=len(nums1)
        if l%2==0:
            return (nums1[l//2-1]+nums1[l//2 ])/2
        else:
            return nums1[l//2]


nums1=list(map(int,input().split()))
nums2=list(map(int,input().split()))

m=Solution()
print(m.findMedianSortedArrays(nums1,nums2))