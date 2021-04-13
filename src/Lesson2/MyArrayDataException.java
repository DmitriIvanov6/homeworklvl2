package Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int index1, int index2, String value) {
        super("Cell " + index1 + " " + index2 + " contains symbol " + value + ", and not a number");
    }
}

