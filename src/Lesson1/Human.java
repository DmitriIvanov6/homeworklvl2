package Lesson1;

public class Human implements Creature {
    private final int maxJump;
    private final int maxRun;
    private String name;

    Human(int maxJump, int maxRun, String name) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.name = name;

    }

    @Override
    public void run(String name) {
        this.name = name;
        System.out.printf("%s побежал%n", name);
    }

    @Override
    public void jump(String name) {
        this.name = name;
        System.out.printf("%s прыгнул%n", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }
}
