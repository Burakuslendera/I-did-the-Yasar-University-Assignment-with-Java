

public class SelectionSort extends SortingAlgorithm {
    public SelectionSort() {
        super("Selection Sort");
    }

    @Override
    public void sort(int[] array, int left, int right, int[] temp) {
        for (int i = left; i < right; i++) {
            int min = i;
            for (int j = i + 1; j <= right; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
    private void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
