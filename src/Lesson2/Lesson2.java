package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        ArrayCalculator arrayCalculator = new ArrayCalculator();

        try {
            System.out.println("Result: " + arrayCalculator.arrayCalculation(myArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

