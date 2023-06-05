package algorithms.sort;

public class InsertionSort {

    private static final InsertionSort INSTANCE = new InsertionSort();

    private InsertionSort() {
    }



    public static InsertionSort getInstance() {
        return INSTANCE;
    }
}
