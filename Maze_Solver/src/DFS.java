package org.example;

import java.util.*;

public class DFS {
    public static boolean searchpath(int[][] maze, int x, int y, List<Integer> path) {
        if(maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x] == 0) {
            maze[y][x] = 2;

            int dx = -1, dy = 0;
            if(searchpath(maze, x+dx, y+dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 1; dy = 0;
            if(searchpath(maze, x+dx, y+dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0; dy = -1;
            if(searchpath(maze, x+dx, y+dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0; dy = 1;
            if(searchpath(maze, x+dx, y+dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}