class Solution {
    private void rotateLeft(int[] dir) {
        if (dir[0] == -1) {
            dir[0] = 0;
            dir[1] = -1;
        } else if (dir[0] == 1) {
            dir[0] = 0;
            dir[1] = 1;
        } else if (dir[1] == -1) {
            dir[0] = 1;
            dir[1] = 0;
        } else {
            dir[0] = -1;
            dir[1] = 0;
        }
    }

    private void rotateRight(int[] dir){
        if (dir[0] == -1) {
            dir[0] = 0;
            dir[1] = 1;
        } else if (dir[0] == 1) {
            dir[0] = 0;
            dir[1] = -1;
        } else if (dir[1] == -1) {
            dir[0] = -1;
            dir[1] = 0;
        } else {
            dir[0] = 1;
            dir[1] = 0;
        }
    }

    private void move(int[] dir, int[] pos, int step, int[][] coord) {
        int factor = 1;
        if (dir[0] < 0 || dir[1] < 0) {
            factor = -1;
        }
        if (dir[0] == 0) {
            for (int i = 1; i <= step; i++) {
                if (coord[pos[0]][pos[1] + (i * factor)] == 1) {
                    break;
                } else {
                    pos[1] += (i * factor);
                }
            }
        } else {
            for (int i = 1; i <= step; i++) {
                if (coord[pos[0] + (i * factor)][pos[1]] == 1) {
                    break;
                } else {
                    pos[0] += (i * factor);
                }
            }
        }
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;
        int direction = 0;
        int maxDistance = 0;
        
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }
        
        for (int command : commands) {
            if (command == -2) {
                direction = (direction + 3) % 4;
            } else if (command == -1) {
                direction = (direction + 1) % 4;
            } else {
                for (int i = 0; i < command; ++i) {
                    int nx = x + directions[direction][0];
                    int ny = y + directions[direction][1];
                    
                    if (obstacleSet.contains(nx + "," + ny)) {
                        break;
                    }
                    
                    x = nx;
                    y = ny;
                    
                    maxDistance = Math.max(maxDistance, x * x + y * y);
                }
            }
        }
        
        return maxDistance;
    }
}