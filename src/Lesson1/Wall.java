package Lesson1;

public class Wall implements Obstacle {
    private final int height;

    Wall(int height) {
        this.height = height;

    }

    @Override
    public boolean overcomeObstacle(int jumpHeight, int wallHeight) {
        return wallHeight <= jumpHeight;
    }

    @Override
    public int getComplexity() {
        return height;
    }
}
