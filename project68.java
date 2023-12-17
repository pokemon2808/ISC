import java.util.Arrays;

public class project68 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Ascending sort
        int[] ascendingNumbers = sortAscending(numbers);
        System.out.println("Nilai yang Ascending: " + Arrays.toString(ascendingNumbers));

        // Descending sort
        int[] descendingNumbers = sortDescending(numbers);
        System.out.println("Nilai yang Descending : " + Arrays.toString(descendingNumbers));
    }

    // Method untuk mengurutkan array secara ascending
    public static int[] sortAscending(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    // Method untuk mengurutkan array secara descending
    public static int[] sortDescending(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        reverseArray(sortedArr);
        return sortedArr;
    }

    // Method untuk membalik urutan array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
