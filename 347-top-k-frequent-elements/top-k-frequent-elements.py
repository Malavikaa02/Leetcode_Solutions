class Solution(object):
    def topKFrequent(self, nums, k):
        res = []
        Hash = Counter(nums)
        sorted_items = sorted(Hash.items(), key=lambda x: x[1], reverse=True)
        for i in range(k):
            res.append(sorted_items[i][0])
        return res

        