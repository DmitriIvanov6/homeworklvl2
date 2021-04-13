package Lesson2;

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Array size is not 4х4, 4x4 is required");
    }

}
