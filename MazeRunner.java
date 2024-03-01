public class MazeRunner {
  public static String walk(int[][] maze, String[] directions) {
        int xPosition = -1;
        int yPosition = -1;
        // Store the starting position, iterate array till 2 is found.
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[j][i] == 2) {
                    xPosition = i;
                    yPosition = j;
                    break;
                }
            }
        }
        // Move with directions order, then check new position.
        for (int i = 0; i < directions.length; i++) {
            switch (directions[i]) {
                case "N":
                    if (yPosition - 1 < 0) return "Dead";
                    yPosition--;
                    break;
                case "S":
                    if (yPosition + 1 == maze[0].length) return "Dead";
                    yPosition++;
                    break;
                case "E":
                    if (xPosition + 1 == maze[0].length) return "Dead";
                    xPosition++;
                    break;
                case "W":
                    if (xPosition - 1 < 0) return "Dead";
                    xPosition--;
                    break;
            }
            if (maze[yPosition][xPosition] == 1) return "Dead";
            if (maze[yPosition][xPosition] == 3) return "Finish";
        }
        return "Lost";
    }
}
