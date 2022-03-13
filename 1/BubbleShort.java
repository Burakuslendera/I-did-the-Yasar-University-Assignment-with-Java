

public class BubbleShort extends SortingAlgorithm {

    public BubbleShort() {
        super("Bubble Short");
    }

    @Override
    public void sort(int[] array, int left, int right, int[] temp) {
        for (int i = left; i < right; i++) {
            for (int j = left; j < right - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    private void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}