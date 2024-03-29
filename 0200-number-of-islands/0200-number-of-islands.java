import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
        public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] vis = new int[rows][cols];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int count = 0;
        Queue<Point> queue = new LinkedList<Point>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0' && vis[i][j] != 1) {
                    vis[i][j] = 1;
                    queue.add(new Point(j, i));
                    count++;
                    while(!queue.isEmpty()) {
                        Point cur = queue.poll();
                        for (int dir = 0; dir <4; dir++) {
                            int nx = cur.x + dx[dir];
                            int ny = cur.y + dy[dir];
                            if (nx < 0 || nx >= cols || ny < 0 || ny >= rows) continue;
                            if (vis[ny][nx] == 1 || grid[ny][nx] == '0') continue;
                            vis[ny][nx] = 1;
                            queue.add(new Point(nx, ny));
                        }
                    }
                }
            }
        }
        return count;
        }
}