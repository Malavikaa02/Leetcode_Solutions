class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        # r = len(matrix)
        # c = len(matrix)
        # transpose = [[0] * r for _ in range(c)]
        # for i in range(r):
        #     for j in range(c):
        #         transpose[j][i] = matrix[i][j]

        # return transpose
        return [list(row) for row in zip(*matrix)]