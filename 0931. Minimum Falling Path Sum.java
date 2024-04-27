class Solution {
  public int minFallingPathSum(int[][] arr) {
    int rows = arr.length;

    for (int i = 1; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
        int min = Integer.MAX_VALUE;
        for (int k = Math.max(0, j - 1); k < Math.min(rows, j + 2); k++) {
          min = Math.min(min, arr[i - 1][k]);
        }
        arr[i][j] += min;
      }
    }

    int res = Integer.MAX_VALUE;
    for (int l = 0; l < rows; l++) {
      res = Math.min(res, arr[rows - 1][l]);
    }

    return res;
  }
}
