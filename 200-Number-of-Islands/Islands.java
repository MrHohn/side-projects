
public class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        if (row == 0) {
            return 0;
        }
        int col = grid[0].length;
        if (col == 0) {
            return 0;
        }
        
        int count = 0;
        int[][] islandNumber = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                // if it is island and not set yet
                if (grid[i][j] == '1' && islandNumber[i][j] == 0) {
                    islandNumber[i][j] = ++count;
                    dfsSet(grid, islandNumber, i, j, row, col, count);
                }
            }
        }
        
        return count;
    }
    
    void dfsSet(char[][] grid, int[][] islandNumber, int i, int j, int row, int col, int count) {
        // check all the neighbours
            // check up
            if (i - 1 >= 0) {
                if (grid[i - 1][j] != '0' && islandNumber[i - 1][j] == 0) {
                    islandNumber[i - 1][j] = count;
                    dfsSet(grid, islandNumber, i - 1, j, row, col, count);
                }
            }
            // check down
            if (i + 1 < row) {
                if (grid[i + 1][j] != '0' && islandNumber[i + 1][j] == 0) {
                    islandNumber[i + 1][j] = count;
                    dfsSet(grid, islandNumber, i + 1, j, row, col, count);
                }
            }
            // check left
            if (j - 1 >= 0) {
                if (grid[i][j - 1] != '0' && islandNumber[i][j - 1] == 0) {
                    islandNumber[i][j - 1] = count;
                    dfsSet(grid, islandNumber, i, j - 1, row, col, count);
                }
            }
            //check right
            if (j + 1 < col) {
                if (grid[i][j + 1] != '0' && islandNumber[i][j + 1] == 0) {
                    islandNumber[i][j + 1] = count;
                    dfsSet(grid, islandNumber, i, j + 1, row, col, count);
                }
            }
    }
}
