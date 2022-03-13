
public class Main {

public static final SortingAlgorithm [] algorihms = new SortingAlgorithm [5];
    public static Main algorthms;

    public static void main(String[] args) {
    algorihms [0] = new BubbleShort();
    algorihms [1] = new InsertionSort();
    algorihms [2] = new SelectionSort();
    algorihms [3] = new MergeSort();
    algorihms [4] = new QuickSort();
    for (int k = 0; k < 10; k++) {
        int[] originalArray = createRandomizedArray(k * 100, 100);
        String original = algorihms[0].printArray(originalArray);
        System.out.println("Original Array: " + original);
        for (SortingAlgorithm algorthms : algorihms) {
            int[] copy = copyArray (originalArray);
            algorthms.testAlgorthms(copy);
        }
    }
    for (SortingAlgorithm algorthms : algorihms ) {
        System.out.println("Average Run time for "
                + algorthms.getClass().getSimpleName()
                +" :"+algorthms.findAverage() + " ms");
    }
}
    public static int[] createRandomizedArray(int min, int max) {
    int[] array = new int[max];
    for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * (max - min) + min);
    }
    return array;
}

public static int[] copyArray(int[] array) {
    int[] copy = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        copy[i] = array[i];
    }
    return copy;
    }
     public static void testAlgorithm(int[] array) {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("Run time for " + algorihms.getClass().getSimpleName() + ":" + runTime + " ms");
    }
}

