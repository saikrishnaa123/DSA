public class FindNoOfIslandsDepthFirstSearchAlgorithm {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark the current land as visited
        grid[i][j] = '0';

        // Recursively visit adjacent lands
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j - 1);
        dfs(grid, i - 1, j + 1);
        dfs(grid, i + 1, j - 1);
        dfs(grid, i + 1, j + 1);
    }

    public static void main(String[] args) {
        /*char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };*/
       // char[][] grid = {{'0','1'},{'1','0'},{'1','1'},{'1','0'}};
        char[][] grid = {{'0','1','1','1','0','0','0'},
                         {'0','0','1','1','0','1','0'}};
        int islands = numIslands(grid);
        System.out.println("Number of Islands: " + islands);
    }
}
