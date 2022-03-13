

public class MergeSort extends SortingAlgorithm {
    private static final String array  = "array" ;

    public MergeSort() {
        super(array);
    }

    @Override
    public void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle, temp);
            sort(array, middle + 1, right, temp);
            merge(array, temp, left, middle, right);
        }
    }
}
