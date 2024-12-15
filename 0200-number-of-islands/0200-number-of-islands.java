class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int landCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    landCount++;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return landCount;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length // range check
                || grid[i][j] == '0' || visited[i][j]) { // water or visted
            return;
        }

        visited[i][j] = true;
        dfs(grid, i - 1, j, visited);
        dfs(grid, i, j - 1, visited);
        dfs(grid, i + 1, j, visited);
        dfs(grid, i, j + 1, visited);

    }
}