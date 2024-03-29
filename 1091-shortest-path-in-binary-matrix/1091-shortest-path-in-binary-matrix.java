import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] vis = new int[rows][cols];

        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};

        Queue<Point> queue = new LinkedList<Point>();
        vis[0][0] = -1;
        if(grid[0][0] != 1) {
            queue.add(new Point(0, 0));
            vis[0][0] = 1;
        }

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            for (int dir = 0; dir < 8; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if (nx < 0 || nx >= cols || ny < 0 || ny >= rows) continue;
                if (vis[ny][nx] != 0 || grid[ny][nx] == 1) continue;
                vis[ny][nx] = vis[cur.y][cur.x] + 1;
                queue.add(new Point(nx, ny));
            }
        }
        return vis[rows -1][cols -1] == 0 ? -1 : vis[rows -1][cols -1];

    }
}