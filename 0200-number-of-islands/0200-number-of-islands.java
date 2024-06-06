import java.util.*;
import java.io.*;

class Solution {
    class Cell {
        int r, c;
        Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    public int numIslands(char[][] grid) {
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        Queue<Cell> queue = new LinkedList<>();
        
        int r = grid.length;
        int c = grid[0].length;
        int[][] vis = new int[r][c];
        
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] != '0' && vis[i][j] != 1) {
                    count++;
                    vis[i][j] = 1;
                    queue.add(new Cell(i, j));
                    while(!queue.isEmpty()) {
                        Cell cur = queue.poll();
                        for (int dir = 0; dir < 4; dir++) {
                            int nr = cur.r + dr[dir];
                            int nc = cur.c + dc[dir];

                            if (nr < 0 || nr >= r || nc < 0 || nc >= c) continue;
                            if (vis[nr][nc] == 1 || grid[nr][nc] == '0') continue;
                            vis[nr][nc] = 1;                            
                            queue.add(new Cell(nr, nc));
                        }
                    }
                } 
            }
        }
        
        return count;
    }
}