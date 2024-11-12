package T20;


public class MedianOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = { 18, 20,10, 12, 14, 16};
        System.out.println("The median is: " + findMedianofArray(arr1, arr2));
    }

    public static int[] mergeTwoArray(int[] array1, int[] array2){
        int[] array3=new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Copy elements from array2 to array3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] > array3[j]) {
                    int temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }
        return array3;
    }

    public static double findMedianofArray(int[] arr1, int[] arr2){

        int[] mergedArray=mergeTwoArray(arr1,arr2);
        int n=mergedArray.length;

        if(n%2==0){
            return (mergedArray[n/2 - 1]+mergedArray[n/2])/2;
        }
        else
            return mergedArray[n/2];
    }
}
