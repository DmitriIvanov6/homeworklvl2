package Lesson1;

public class Treadmill implements Obstacle {
    private final int length;

    Treadmill(int length) {
        this.length = length;

    }
    @Override
    public boolean overcomeObstacle(int runDistance, int treadmillLength) {
        return treadmillLength <= runDistance;
    }
    @Override
    public int getComplexity() {
        return length;
    }
}
