class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxC = max(candies)
        res = []
        for i in range(len(candies)):
            if candies[i] + extraCandies >= maxC:
                res.append(True)
            else:
                res.append(False)
        return res