public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        ///as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        bs.sort();
        qs.sort();
        
    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
