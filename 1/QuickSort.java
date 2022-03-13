
public class QuickSort extends SortingAlgorithm {
    private static final String array  = "array" ;
    public QuickSort() {
        super(array);
    }

    @Override
    public void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1, temp);
            sort(array, pivot + 1, right, temp);
        }
    }
}
