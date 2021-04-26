package by.arraysort.training;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Unsorted array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        printArray(array);
        System.out.println();
        System.out.println("Sorted array 1 way:");
        boolean sorted = false;
        int counter;
        while (!sorted) {
            sorted = true;
            for (counter = 0; counter < array.length - 1; counter++) {
                if (array[counter] > array[counter + 1]) {
                    sorted = false;
                    int temp = array[counter];
                    array[counter] = array[counter + 1];
                    array[counter + 1] = temp;
                }
            }
        }
        printArray(array);
        System.out.println();
        System.out.println("Sorted array 2 way:");
        int i;
        for (i = 0; i < array.length - 1; i++) {
                sorted = true;
                for (int j=0;j<array.length-1-i;j++) {
                    if (array[j] > array[j + 1]) {
                        sorted = false;
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                if (sorted) {
                    break;
                }
            }

        printArray(array);

    }


    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
