package T20;

public class SmallestMissingInteger {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(findSmallestMissingInteger(arr1)); // Output: 0

        int[] arr2 = {0, 1, 3, 4};
        System.out.println(findSmallestMissingInteger(arr2)); // Output: 2
    }

    public static int findSmallestMissingInteger(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }
}
