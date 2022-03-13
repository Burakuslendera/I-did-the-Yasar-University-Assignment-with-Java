

public abstract class SortingAlgorithm {
    public SortingAlgorithm(String array) {
    }

    public static void merge(int[] a, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        while (i <= mid - 1 && j <= right) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid - 1) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (int l = left; l <= right; l++) {
            a[l] = temp[l];
        }
    }

    static int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[right];
        a[right] = temp;
        return i + 1;
    }

    private static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
    }

    public abstract void sort(int[] array, int left, int right, int[] temp);
    public String printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return null;
    }
    public void testAlgorthms(int[] copy) {
        int[] array = copy.clone();
        long startTime = System.currentTimeMillis();
        sort(array, 0, array.length - 1, new int[array.length]);
        long endTime = System.currentTimeMillis();
        printArray(array);
        System.out.println("Time taken: " + (endTime - startTime));
    }


    public int getRunTime() {
        int[] array = createRandomizedArray(10000);
        int[] temp = new int[array.length];
        long startTime = System.currentTimeMillis();
        sort(array, 0, array.length - 1, temp);
        long endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }

    private int[] createRandomizedArray(int i) {
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 100);
        }
        return array;
    }
    public static int findAverage() {
        int sum = 0;
        for (int i = 0; i < Main.algorihms.length; i++) {
            sum += Main.algorihms[i].getRunTime();
        }
        return sum / Main.algorihms.length;
    }
}