package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        Creature[] creatures = {
                new Cat(5, 15, "Барсик"),
                new Cat(6, 24, "Пушок"),
                new Cat(4, 45, "Бегемот"),
                new Human(4, 35, "Иван"),
                new Human(5, 30, "Василий"),
                new Human(3, 20, "Петр"),
                new Robot(10, 40, "Alpha"),
                new Robot(5, 25, "Beta"),
                new Robot(7, 15, "Gamma")
        };
        Obstacle[] obstacles = {
                new Wall(4),
                new Treadmill(25),
                new Treadmill(20),
                new Wall(5)
        };

        for (Creature creature : creatures) {
            creature.jump(creature.getName());
            creature.run(creature.getName());
        }

        System.out.println("------------");
        System.out.println("Соревнования");
        System.out.println("------------");

        for (Creature creature : creatures) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if (obstacle.overcomeObstacle(creature.getMaxJump(), obstacle.getComplexity())) {
                        System.out.printf("%s перепрыгнул стену%n", creature.getName());
                    } else {
                        System.out.printf("%s не перепрыгнул стену%n", creature.getName());
                        break;
                    }
                } else {
                    if (obstacle.overcomeObstacle(creature.getMaxRun(), obstacle.getComplexity())) {
                        System.out.printf("%s пробежал дистанцию%n", creature.getName());
                    } else {
                        System.out.printf("%s не пробежал дистанцию%n", creature.getName());
                        break;
                    }
                }
            }
        }
    }
}

