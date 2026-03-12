package SecondSession;

public class RatMatrix2D {

    static int n = 5;

    static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1);
    }

    static boolean solveMaze(int[][] maze, int x, int y, int[][] res) {

        // destination reached
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            res[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {

            res[x][y] = 1;

            // move down
            if (solveMaze(maze, x + 1, y, res))
                return true;

            // move right
            if (solveMaze(maze, x, y + 1, res))
                return true;

            // backtracking
            res[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

        int maze[][] = {
                {1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1}
        };

        int res[][] = new int[n][n];

        if (solveMaze(maze, 0, 0, res)) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("No Path Found");
        }
    }
}