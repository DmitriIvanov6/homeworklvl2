package Lesson2;

public class ArrayCalculator {

    public int arrayCalculation(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        for (String[] strings : myArray) {
            if (myArray.length > 4 || strings.length > 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + 1, j + 1, myArray[i][j]);
                }
            }
        }
        return sum;
    }
}
