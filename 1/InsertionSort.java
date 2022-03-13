
public class InsertionSort extends SortingAlgorithm {
    private static final String array  = "array" ;

    public InsertionSort() {
        super(array);
    }


    private void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    @Override
    public void sort(int[] array, int left, int right, int[] temp) {
        for (int i = left + 1; i <= right; i++) {
            int j = i;
            while (j > left && array[j - 1] > array[j]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }
}